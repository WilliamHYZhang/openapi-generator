/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// TypeTesting : Test handling of different field data types



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct TypeTesting {
    #[serde(rename = "int32")]
    pub int32: i32,
    #[serde(rename = "int64")]
    pub int64: i64,
    #[serde(rename = "float")]
    pub float: f32,
    #[serde(rename = "double")]
    pub double: f64,
    #[serde(rename = "string")]
    pub string: String,
    #[serde(rename = "boolean")]
    pub boolean: bool,
    #[serde(rename = "uuid")]
    pub uuid: uuid::Uuid,
}

impl TypeTesting {
    /// Test handling of different field data types
    pub fn new(int32: i32, int64: i64, float: f32, double: f64, string: String, boolean: bool, uuid: uuid::Uuid) -> TypeTesting {
        TypeTesting {
            int32,
            int64,
            float,
            double,
            string,
            boolean,
            uuid,
        }
    }
}

