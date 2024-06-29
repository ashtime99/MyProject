# MyProject

脚手架，快速搭建项目

## 版本

Java 8

## 依赖

- Spring Boot 2.7.4
- MySQL

## 约定

约定大于配置

### 数据库

- 主键`id`：类型 `bigint` 无符号、自增
- 三个必要的字段：
    - `create_time`：默认值`CURRENT_TIMESTAMP`、
    - `update_time`：默认值`CURRENT_TIMESTAMP`，根据当前时间戳更新、
    - `is_deleted`：类型`tinyint`默认值`0`，无符号