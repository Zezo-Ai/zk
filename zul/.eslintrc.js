module.exports = {
  "root": true,
  "parser": "@typescript-eslint/parser",
  "plugins": [
    "@typescript-eslint"
  ],
  "parserOptions": {
    "ecmaVersion": 5,
    "sourceType": "script",
    "ecmaFeatures": {},
    "tsconfigRootDir": __dirname,
    "project": "./tsconfig.json"
  },
  "env": {
    "browser": true
  },
  "overrides": [
    {
      "files": [
        "*.ts"
      ],
      "extends": [
        "eslint:recommended",
        "plugin:@typescript-eslint/recommended",
        "plugin:@typescript-eslint/recommended-requiring-type-checking",
        "plugin:@typescript-eslint/strict"
      ],
      "rules": { // Recommended
        // Possible Problems
        "no-cond-assign": "warn",
        "no-constant-condition": [
          "error",
          {
            "checkLoops": false
          }
        ],
        // Suggestions
        "no-alert": "error",
        "no-console": "error",
        "no-empty": [
          "error",
          {
            "allowEmptyCatch": true
          }
        ],
        "no-empty-function": "error",
        "no-eval": "warn",
        "no-implied-eval": "warn",
        "no-var": "off",
        "prefer-const": "warn",
        "prefer-rest-params": "warn",
        "prefer-spread": "warn",
        // Layout & Formatting
        "brace-style": [
          "error",
          "1tbs",
          {
            "allowSingleLine": true
          }
        ],
        "dot-location": [
          "error",
          "property"
        ],
        "no-mixed-spaces-and-tabs": [
          "error",
          "smart-tabs"
        ],
        "no-multi-spaces": [
          "error",
          {
            "ignoreEOLComments": true
          }
        ],
        "no-multiple-empty-lines": "error",
        "no-trailing-spaces": [
          "error",
          {
            "skipBlankLines": true
          }
        ],
        "semi-spacing": "error",
        "semi-style": "error",
        "space-unary-ops": "error",
        "key-spacing": "error",
        "func-call-spacing": "error",
        "one-var": [
          "error",
          "consecutive"
        ],
        "space-before-function-paren": [
          "error",
          {
            "named": "ignore"
          }
        ],
        "space-in-parens": "error",
        "semi": "error",
        "space-infix-ops": "error",
        "keyword-spacing": "error",
        "space-before-blocks": "error",
        "switch-colon-spacing": "error",
        "comma-spacing": "error",
        "comma-style": "error",
        "quotes": [
          "error",
          "single",
          {
            "avoidEscape": true
          }
        ],
        "unicode-bom": "error",
        // typescript
        "no-undef": "off",
        "no-unused-vars": "off",
        "@typescript-eslint/no-unused-vars": "off",
        "@typescript-eslint/consistent-type-assertions": [
          "error",
          {
            "assertionStyle": "as",
            "objectLiteralTypeAssertions": "never"
          }
        ],
        "@typescript-eslint/consistent-type-definitions": [
          "error",
          "interface"
        ],
        "@typescript-eslint/explicit-function-return-type": [
          "error",
          {
            "allowExpressions": true,
            "allowTypedFunctionExpressions": true,
            "allowHigherOrderFunctions": true
          }
        ],
        "@typescript-eslint/explicit-member-accessibility": "error",
        "@typescript-eslint/explicit-module-boundary-types": "error",
        "@typescript-eslint/member-delimiter-style": "error",
        "@typescript-eslint/naming-convention": [
          "error",
          {
            "selector": "interface",
            "format": [
              "PascalCase"
            ],
            "custom": {
              "regex": "^I[A-Z]",
              "match": false
            }
          }
        ],
        "@typescript-eslint/no-empty-interface": [
          "error",
          {
            "allowSingleExtends": true
          }
        ],
        "@typescript-eslint/no-explicit-any": "error",
        "@typescript-eslint/no-implied-eval": "warn",
        "@typescript-eslint/no-namespace": [
          "error",
          {
            "allowDeclarations": true,
            "allowDefinitionFiles": true
          }
        ],
        "@typescript-eslint/no-non-null-asserted-nullish-coalescing": "off",
        "@typescript-eslint/no-non-null-asserted-optional-chain": "off",
        "@typescript-eslint/no-non-null-assertion": "off",
        "@typescript-eslint/no-parameter-properties": "error", // deprecated
        "@typescript-eslint/no-require-imports": "error",
        "@typescript-eslint/no-this-alias": "warn",
        "@typescript-eslint/restrict-plus-operands": "warn",
        "@typescript-eslint/triple-slash-reference": [
          "error",
          {
            "path": "never",
            "types": "never",
            "lib": "never"
          }
        ],
        "@typescript-eslint/type-annotation-spacing": "error",
        "@typescript-eslint/unbound-method": "off"
      }
    }
  ]
}