package fr.n7.stl.block.ast;

/**
 * Factory to create Abstract Syntax Tree nodes for common expressions in programming languages.
 * @author Marc Pantel
 *
 */
public interface ExpressionFactory {

	/**
	 * Create a node for a binary expression in the Abstract Syntax Tree.
	 * @param _left Abstract Syntax Tree for the left parameter of the binary operation.
	 * @param _operator Enum value for the binary operator.
	 * @param _right Abstract Syntax Tree for the right parameter of the binary operation.
	 * @return Abstract Syntax Tree node for the binary operation.
	 */
    Expression createBinaryExpression(Expression _left, BinaryOperator _operator, Expression _right);

	/**
	 * Create a node for an unary expression in the Abstract Syntax Tree.
	 * @param _operator Enum value for the unary operator.
	 * @param _parameter Abstract Syntax Tree for the parameter of the unary operation.
	 * @return Abstract Syntax Tree node for the unary operation.
	 */
    Expression createUnaryExpression(UnaryOperator _operator, Expression _parameter);
	
	/**
	 * Create a node for an integer value expression in the Abstract Syntax Tree.
	 * @param _texte Textual representation of the value of the Abstract Syntax Tree IntegerValue node.
	 * @return Abstract Syntax Tree node for the integer constant.
	 */
    Value createIntegerValue(String _texte);
	
	/**
	 * Create a node for a boolean value expression in the Abstract Syntax Tree.
	 * @param _value Boolean value for the Abstract Syntax Tree BooleanValue node.
	 * @return Abstract Syntax Tree node for the boolean constant.
	 */
    Value createBooleanValue(boolean _value);
	
	// <REMOVE>
	// public Expression createVariableUse(String _name);
	// </REMOVE>
	
	/**
	 * Create a node for a variable use expression in the Abstract Syntax Tree.
	 * with resolving the reference with the Symbol Table.	 
	 * @param _declaration Abstract Syntax Tree node for the declaration of the variable.
	 * @return Abstract Syntax Tree node for the access to a variable.
	 */
    Expression createVariableUse(VariableDeclaration _declaration);
	
	/**
	 * Create a node for a variable assignment in the Abstract Syntax Tree.
	 * with resolving the reference with the Symbol Table.	 
	 * @param _declaration Abstract Syntax Tree node for the declaration of the variable.
	 * @return Abstract Syntax Tree node for the access to a variable.
	 */
    Assignable createVariableAssignment(VariableDeclaration _declaration);
	
	/**
	 * Create a node for a couple creation expression in the Abstract Syntax Tree.
	 * @param _left Abstract Syntax Tree node for the left part of the couple.
	 * @param _right Abstract Syntax Tree node for the right part of the couple.
	 * @return Abstract Syntax Tree node for a couple containing the _left and _right parts.
	 */
    Expression createCouple(Expression _left, Expression _right);
	
	/**
	 * Create a node for an access to the first value of a couple expression in the Abstract Syntax Tree.
	 * @param _couple Abstract Syntax Tree node for the couple.
	 * @return Abstract Syntax Tree node for the left part of the _couple.
	 */
    Expression createFirst(Expression _couple);
	
	/**
	 * Create a node for an access to the first value of a couple expression in the Abstract Syntax Tree.
	 * @param _couple Abstract Syntax Tree node for the couple.
	 * @return Abstract Syntax Tree node for the right part of the _couple.
	 */
    Expression createSecond(Expression _couple);
	
	/**
	 * Create a node for a function call expression in the Abstract Syntax Tree.
	 * @param _called Abstract Syntax Tree node for the called function.
	 * @return Abstract Syntax Tree node for the call of the _called function.
	 */
    FunctionCall createFunctionCall(Expression _called);
	
	/**
	 * Create a node for an access to an element in an array expression in the Abstract Syntax Tree.
	 * @param _array Abstract Syntax Tree node for the array.
	 * @param _index Abstract Syntax Tree node for the index in the array.
	 * @return Abstract Syntax Tree node for the access of the _index cell in the _array.
	 */
    Expression createArrayAccess(Expression _array, Expression _index);
	
	/**
	 * Create a node for an assignment to an element in an array expression in the Abstract Syntax Tree.
	 * @param _array Abstract Syntax Tree node for the array.
	 * @param _index Abstract Syntax Tree node for the index in the array.
	 * @return Abstract Syntax Tree node for the access of the _index cell in the _array.
	 */
    Assignable createArrayAssignment(Assignable _array, Expression _index);

	/**
	 * Create a node for an access to the pointed value in an expression in the Abstract Syntax Tree.
	 * @param _type Abstract Syntax Tree node for the pointer.
	 * @return Abstract Syntax Tree node for the access of the content of the _pointer.
	 */
    Expression createArrayAllocation(Type _type, Expression _size);

	/**
	 * Create a node for an access to a field in a record expression in the Abstract Syntax Tree.
	 * with resolving the reference to the Field Declaration with the Symbol Table.
	 * @param _record Abstract Syntax Tree node for the record.
	 * @param _field Abstract Syntax Tree node for the field in the record.
	 * @return Abstract Syntax Tree node for the access of the _field in the _record.
	 */
    Expression createFieldAccess(Expression _record, FieldDeclaration _field);
	
	/**
	 * Create a node for an assignment to a field in a record expression in the Abstract Syntax Tree.
	 * with resolving the reference to the Field Declaration with the Symbol Table.
	 * @param _record Abstract Syntax Tree node for the record.
	 * @param _field Abstract Syntax Tree node for the field in the record.
	 * @return Abstract Syntax Tree node for the access of the _field in the _record.
	 */
    Assignable createFieldAssignment(Assignable _record, FieldDeclaration _field);

	/**
	 * Create a node for an access to a field in a record expression in the Abstract Syntax Tree.
	 * without resolving the reference to the field name with the Symbol Table.
	 * @param _record Abstract Syntax Tree node for the record.
	 * @param _name Name of the field in the record.
	 * @return Abstract Syntax Tree node for the access of the _name in the _record.
	 */
    Expression createFieldAccess(Expression _record, String _name);

	/**
	 * Create a node for an assignment to a field in a record expression in the Abstract Syntax Tree.
	 * without resolving the reference to the field name with the Symbol Table.
	 * @param _record Abstract Syntax Tree node for the record.
	 * @param _name Name of the field in the record.
	 * @return Abstract Syntax Tree node for the access of the _name in the _record.
	 */
    Assignable createFieldAssignment(Assignable _record, String _name);

	/**
	 * Create a node for an access to the pointed value in an expression in the Abstract Syntax Tree.
	 * @param _pointer Abstract Syntax Tree node for the pointer.
	 * @return Abstract Syntax Tree node for the access of the content of the _pointer.
	 */
    Expression createPointerAccess(Expression _pointer);
	
	/**
	 * Create a node for an assignment to the pointed value in an expression in the Abstract Syntax Tree.
	 * @param _pointer Abstract Syntax Tree node for the pointer.
	 * @return Abstract Syntax Tree node for the access of the content of the _pointer.
	 */
    Assignable createPointerAssignment(Assignable _pointer);

	/**
	 * Create a node for an access to the pointed value in an expression in the Abstract Syntax Tree.
	 * @param _type Abstract Syntax Tree node for the pointer.
	 * @return Abstract Syntax Tree node for the access of the content of the _pointer.
	 */
    Expression createPointerAllocation(Type _type);

	/**
	 * Create a node for an access to the pointed value in an expression in the Abstract Syntax Tree.
	 * @param _variable Abstract Syntax Tree node for the pointer.
	 * @return Abstract Syntax Tree node for the access of the content of the _pointer.
	 */
    Expression createAddressAccess(Expression _variable);
		
	/**
	 * Create a node for a type conversion of an expression in the Abstract Syntax Tree.
	 * @param _target Abstract Syntax Tree for the expression whose value is converted.
	 * @param _type Abstract Syntax Tree for the type toward which the expression value is converted.
	 * @return Abstract Syntax Tree node for the conversion of the value of a target expression to a type.
	 */
    Expression createTypeConversion(Expression _target, Type _type);

	/**
	 * Create a node for a sequence of expressions in the Abstract Syntax Tree.
	 * @return Abstract Syntax Tree node for the creation of a sequence of values.
	 */
    Sequence createSequence();

	/**
	 * Create a node for a sequence of expressions in the Abstract Syntax Tree.
	 * @param _values Abstract Syntax Tree nodes for the values in the collection.
	 * @return Abstract Syntax Tree node for the creation of a collection of values.
	 */
    Sequence createSequence(Iterable<Expression> _values);
}
