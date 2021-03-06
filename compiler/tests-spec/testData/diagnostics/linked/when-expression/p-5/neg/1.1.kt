/*
 * KOTLIN DIAGNOSTICS SPEC TEST (NEGATIVE)
 *
 * SECTIONS: when-expression
 * PARAGRAPH: 5
 * SENTENCE: [1] The else entry is also special in the sense that it must be the last entry in the expression, otherwise a compiler error must be generated.
 * NUMBER: 1
 * DESCRIPTION: 'When' without bound value and with 'else' branch not in the last position.
 */

// TESTCASE NUMBER: 1
fun case_1(<!UNUSED_PARAMETER!>value_1<!>: Int): String = when {
    <!ELSE_MISPLACED_IN_WHEN!>else<!> -> ""
    <!UNREACHABLE_CODE!>value_1 == 1 -> ""<!>
}

// TESTCASE NUMBER: 2
fun case_2(value_1: Int): String = when {
    value_1 == 1 -> ""
    <!ELSE_MISPLACED_IN_WHEN!>else<!> -> ""
    <!UNREACHABLE_CODE!>value_1 == 2 -> ""<!>
}

// TESTCASE NUMBER: 3
fun case_3(): String {
    when {
        <!ELSE_MISPLACED_IN_WHEN!>else<!> -> return ""
        <!UNREACHABLE_CODE!>else -> return ""<!>
    }

    <!UNREACHABLE_CODE!>return ""<!>
}
