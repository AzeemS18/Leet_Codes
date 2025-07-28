class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        mapi ={ "]":"[","}":"{",")":"("}
        stack=[]
        for i in s:
            if i in mapi:
                top=stack.pop() if stack else "#"
                if mapi[i] != top:
                    return False
        
            else:
                stack.append(i)
        return not stack