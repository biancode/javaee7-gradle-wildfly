ruleset {
    description 'AO Sample Groovy RuleSet'

    CyclomaticComplexity {
        maxMethodComplexity = 1
    }

    ClassName

    MethodName

    ConfusingTernary(priority:3)

    StatelessClass {
        name = 'StatelessDao'
        applyToClassNames = '*Dao'
    }
}