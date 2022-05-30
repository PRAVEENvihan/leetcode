from collections import defaultdict, deque

class Solution:
    def findLadders(self, beginWord: str, endWord: str, wordList):
        wordList.append(beginWord)
        graph = defaultdict(set)
        for i1 in range(len(wordList)):
            for i2 in range(i1+1, len(wordList)):
                if sum(c1 != c2 for c1, c2 in zip(wordList[i1], wordList[i2])) == 1:
                    graph[wordList[i1]].add(wordList[i2])
                    graph[wordList[i2]].add(wordList[i1])

        paths = defaultdict(list)  # each value is a list of the shortest path from beginWord to the key
        paths[beginWord] = [[beginWord]]
        q = deque([(beginWord, [beginWord])])  # element: (node, path)
        while q:
            cur_w, cur_path = q.popleft()
            for next_w in (w for w in graph[cur_w] if (w not in paths) or (len(paths[w][-1]) == len(cur_path)+1)):
                next_path = cur_path + [next_w]
                paths[next_w].append(next_path)
                if cur_w != endWord:
                    q.append((next_w, next_path))
        return paths[endWord]