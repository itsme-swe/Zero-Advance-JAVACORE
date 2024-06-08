## String Buffer Class
With the help of **StringBuffer** we can create string object and this time string buffer objects are mutable.

    StringBuffer sb = new StringBuffer("Harsh");

### StringBuffer constructors
**🔸Stringbuffer( ){---}**

**🔸StringBuffer(CharSequence seq) {---}**

**🔸StringBuffer(String str) {---}**

**🔸StringBuffer(int capacity) {---}**

    StringBuffer increase its capacity by doubling the "default capacity(16) * 2 + 2 = 34" and this only happens when the initial default capacity gets full.
