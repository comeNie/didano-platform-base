package cn.didano.base.dao;

import java.util.List;

import cn.didano.base.model.Tb_benchmark;

public interface Hand_benchmarkMapper {
	List<Tb_benchmark> selectByPrimaryKey(Tb_benchmark tb);
}