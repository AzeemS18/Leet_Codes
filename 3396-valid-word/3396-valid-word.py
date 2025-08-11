class Solution(object):
    def isValid(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if len(word) < 3:
            return False
        if not word.isalnum():
            return False
        hvowels=False
        hconsonant=False
        x = set("aeiouAEIOU")
        for i in word:
            if i.isalpha():
                if i in x:
                    hvowels=True
                else:
                    hconsonant=True
        return hvowels and hconsonant
        
        