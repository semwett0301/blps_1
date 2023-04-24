package com.example.code.model.mappers;

import com.example.code.model.dto.ResponseCreateOrder;
import com.example.code.model.dto.ResponseOrder;
import com.example.code.model.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    ResponseCreateOrder toResponseCreateOrder(Order order);

    ResponseOrder toResponseOrders(Order order);
}
