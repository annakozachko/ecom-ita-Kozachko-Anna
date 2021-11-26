package enums.table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TableField {
        INPUT_DATA("inputData"),
        FIELD_NAME("fieldName");

        private final String name;

        @Override
        public String toString(){
            return name;
        }
}
