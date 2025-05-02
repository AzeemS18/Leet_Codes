class Solution:
    def pushDominoes(self, dominoes: str) -> str:
        queue = []
        for index, char in enumerate(dominoes):
            if char != '.':
                queue.append(index)
        
        visited = [list(dominoes), list(dominoes)]
        n = len(dominoes)
        
        while queue:
            index = queue.pop(0)
            if visited[0][index] == 'L' and index - 1 >= 0:
                if visited[0][index - 1] == '.':
                    visited[0][index - 1] = 'L'
                    queue.append(index)
                elif visited[1][index - 1] == '.':
                    visited[1][index - 1] = 'L'
                    queue.append(index - 1)
            elif visited[0][index] == 'R' and index + 1 < n:
                if visited[0][index + 1] == '.':
                    visited[0][index + 1] = 'R'
                    queue.append(index)
                elif visited[1][index + 1] == '.':
                    visited[1][index + 1] = 'R'
                    queue.append(index + 1)
        
        return ''.join(c1 if c1 == c2 else '.' for c1, c2 in zip(visited[0], visited[1]))