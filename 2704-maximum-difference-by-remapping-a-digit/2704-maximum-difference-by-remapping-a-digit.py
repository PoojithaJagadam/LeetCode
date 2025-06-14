class Solution:
    def minMaxDifference(self, num: int) -> int:
        s=str(num)
        for i in s:
            if i!='9':
                s1=s.replace(i,'9')
                break
            else:
                s1=s
        
        for i in s:
            if i!='0':
                s2=s.replace(i,'0')
                break
            else:
                s2=s
        
        return int(s1)-int(s2)
        