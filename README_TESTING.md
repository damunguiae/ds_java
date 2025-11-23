# JUnit Testing Setup

## Structure
```
ds_java/
├── ds/                    # Source code
│   └── linear/
│       └── linkedList/
├── test/                  # Test code
│   └── ds/
│       └── linear/
│           └── linkedList/
├── lib/                   # JUnit library
└── out/                   # Compiled classes
```

## Running Tests

### Option 1: Using the script
```bash
chmod +x compile-tests.sh
./compile-tests.sh
```

### Option 2: Manual commands
```bash
# 1. Compile source code
javac -d out ds/linear/linkedList/*.java

# 2. Compile tests
javac -cp "lib/junit-platform-console-standalone-1.10.1.jar:out" -d out test/ds/linear/linkedList/*.java

# 3. Run tests
java -jar lib/junit-platform-console-standalone-1.10.1.jar --class-path out --scan-class-path
```

## Writing Tests

Test files go in `test/` directory matching the package structure.

Example test:
```java
@Test
void testMethodName() {
    // Arrange
    linkedList list = new linkedList();
    
    // Act
    list.add(5);
    
    // Assert
    assertEquals(1, list.getSize());
}
```

## Common Assertions
- `assertEquals(expected, actual)`
- `assertTrue(condition)`
- `assertFalse(condition)`
- `assertNull(object)`
- `assertNotNull(object)`
- `assertThrows(Exception.class, () -> code())`
