#### `@notnull`

Marks an individual type, all types in a package or all types in a module as non-null.

Assigning `null` to an instance of a type marked as `@nonnull` is an error.

Passing `null` as a method argument of a type marked as `@nonnull` is an error.


#### `@nullable`

Marks an individual type, a field or a parameter as nullable.

Assigning `null` to a field of a type not marked as `@nullable` is a warning,
except when the type itself has been marked with `@nonnull`, in which case it is an error.

Passing `null` as a method argument of a type not marked as `@nullable` is a warning,
except when the type itself has been marked with `@nonnull`, in which case it is an error.


#### `@immutable`

Marks all parameters a package or module as immutable.

Assigning a value to a parameter marked as `@immutable` is an error.


#### `@mutable`

Marks a parameter or local variable as mutable.

Assigning a value to a parameter or local variable is a warning,
except when the parameter is marked as `@immutable`, in which case it is an error.
