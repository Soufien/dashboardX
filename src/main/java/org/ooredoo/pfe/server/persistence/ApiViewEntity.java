package org.ooredoo.pfe.server.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.ooredoo.pfe.client.ApiView;



@Entity
@Table(name = "api_key_or_method_usage_view")
public class ApiViewEntity implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6078064136284279791L;

	@Id
	@Column(name="metric_id")
	private String metric_id;
	
	@Column(name="uuid")
	private String uuid;
	
	@Column(name="api_id")
	private String api_id;
	
	@Column(name="api_name")
	private String api_name;
	
	@Column(name="api_uri")
	private String api_uri;
	
	@Column(name="resolution")
	private String resolution;
	
	@Column(name="bin_start_time")
	private String bin_start_time;
	
	@Column(name="bin_end_time")
	private String bin_end_time;
	
	@Column(name="front_min")
	private String front_min;
	
	@Column(name="front_max")
	private String front_max;
	
	@Column(name="front_sum")
	private String front_sum;
	
	@Column(name="back_min")
	private String back_min;
	
	@Column(name="back_max")
	private String back_max;
	
	@Column(name="back_sum")
	private String back_sum;
	
	@Column(name="hits_total")
	private String hits_total;
	
	@Column(name="hits_success")
	private String hits_success;
	
	@Column(name="hits_total_errors")
	private String hits_total_errors;
	
	@Column(name="hits_policy_errors")
	private String hits_policy_errors;
	
	@Column(name="hits_routing_errors")
	private String hits_routing_errors;
	
	@Column(name="api_key")
	private String api_key;
	
	@Column(name="api_method")
	private String api_method;

    public ApiViewEntity() {
    }

    public ApiViewEntity(ApiView e) {
        
        this.metric_id 				= e.getMetric_id();
        this.uuid 					= e.getUuid();
        this.api_id 				= e.getApi_id();
        this.api_name 				= e.getApi_name();
        this.api_uri 				= e.getApi_uri();
        this.resolution 			= e.getResolution();
        this.bin_start_time 		= e.getBin_start_time();
        this.bin_end_time 			= e.getBin_end_time();
        this.front_min 				= e.getFront_min();
        this.front_max 				= e.getFront_max();
        this.front_sum 				= e.getFront_sum();
        this.back_min 				= e.getBack_min();
        this.back_max 				= e.getBack_max();
        this.back_sum 				= e.getBack_sum();
        this.hits_total 			= e.getHits_total();
        this.hits_success 			= e.getHits_success();
        this.hits_total_errors 		= e.getHits_total_errors();
        this.hits_policy_errors 	= e.getHits_policy_errors();
        this.hits_routing_errors 	= e.getHits_routing_errors();
        this.api_key 				= e.getApi_key();
        this.api_method 			= e.getApi_method();
    }



    public ApiView toGwtObject() {
    	ApiView e = new ApiView();
        
        e.setMetric_id(metric_id);
        e.setApi_id(api_id);
        e.setApi_key(api_key);
        e.setApi_method(api_method);
        e.setApi_name(api_name);
        e.setApi_uri(api_uri);
        e.setBack_max(back_max);
        e.setBack_min(back_min);
        e.setBack_sum(back_sum);
        e.setBin_end_time(bin_end_time);
        e.setBin_start_time(bin_start_time);
        e.setFront_max(front_max);
        e.setFront_min(front_min);
        e.setFront_sum(front_sum);
        e.setHits_policy_errors(hits_policy_errors);
        e.setHits_routing_errors(hits_routing_errors);
        e.setHits_success(hits_success);
        e.setHits_total(hits_total);
        e.setHits_total_errors(hits_total_errors);
        e.setUuid(uuid);
        e.setResolution(resolution);

        return e;
    }
    

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the api_name
	 */
	public String getApi_name() {
		return api_name;
	}

	/**
	 * @param api_name the api_name to set
	 */
	public void setApi_name(String api_name) {
		this.api_name = api_name;
	}

	/**
	 * @return the api_id
	 */
	public String getApi_id() {
		return api_id;
	}

	/**
	 * @param api_id the api_id to set
	 */
	public void setApi_id(String api_id) {
		this.api_id = api_id;
	}

	/**
	 * @return the api_uri
	 */
	public String getApi_uri() {
		return api_uri;
	}

	/**
	 * @param api_uri the api_uri to set
	 */
	public void setApi_uri(String api_uri) {
		this.api_uri = api_uri;
	}

	/**
	 * @return the resolution
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * @param resolution the resolution to set
	 */
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	/**
	 * @return the bin_start_time
	 */
	public String getBin_start_time() {
		return bin_start_time;
	}

	/**
	 * @param bin_start_time the bin_start_time to set
	 */
	public void setBin_start_time(String bin_start_time) {
		this.bin_start_time = bin_start_time;
	}

	/**
	 * @return the bin_end_time
	 */
	public String getBin_end_time() {
		return bin_end_time;
	}

	/**
	 * @param bin_end_time the bin_end_time to set
	 */
	public void setBin_end_time(String bin_end_time) {
		this.bin_end_time = bin_end_time;
	}

	/**
	 * @return the front_min
	 */
	public String getFront_min() {
		return front_min;
	}

	/**
	 * @param front_min the front_min to set
	 */
	public void setFront_min(String front_min) {
		this.front_min = front_min;
	}

	/**
	 * @return the front_max
	 */
	public String getFront_max() {
		return front_max;
	}

	/**
	 * @param front_max the front_max to set
	 */
	public void setFront_max(String front_max) {
		this.front_max = front_max;
	}

	/**
	 * @return the front_sum
	 */
	public String getFront_sum() {
		return front_sum;
	}

	/**
	 * @param front_sum the front_sum to set
	 */
	public void setFront_sum(String front_sum) {
		this.front_sum = front_sum;
	}

	/**
	 * @return the back_min
	 */
	public String getBack_min() {
		return back_min;
	}

	/**
	 * @param back_min the back_min to set
	 */
	public void setBack_min(String back_min) {
		this.back_min = back_min;
	}

	/**
	 * @return the back_max
	 */
	public String getBack_max() {
		return back_max;
	}

	/**
	 * @param back_max the back_max to set
	 */
	public void setBack_max(String back_max) {
		this.back_max = back_max;
	}

	/**
	 * @return the back_sum
	 */
	public String getBack_sum() {
		return back_sum;
	}

	/**
	 * @param back_sum the back_sum to set
	 */
	public void setBack_sum(String back_sum) {
		this.back_sum = back_sum;
	}

	/**
	 * @return the hits_total
	 */
	public String getHits_total() {
		return hits_total;
	}

	/**
	 * @param hits_total the hits_total to set
	 */
	public void setHits_total(String hits_total) {
		this.hits_total = hits_total;
	}

	/**
	 * @return the hits_success
	 */
	public String getHits_success() {
		return hits_success;
	}

	/**
	 * @param hits_success the hits_success to set
	 */
	public void setHits_success(String hits_success) {
		this.hits_success = hits_success;
	}

	/**
	 * @return the hits_total_errors
	 */
	public String getHits_total_errors() {
		return hits_total_errors;
	}

	/**
	 * @param hits_total_errors the hits_total_errors to set
	 */
	public void setHits_total_errors(String hits_total_errors) {
		this.hits_total_errors = hits_total_errors;
	}

	/**
	 * @return the hits_policy_errors
	 */
	public String getHits_policy_errors() {
		return hits_policy_errors;
	}

	/**
	 * @param hits_policy_errors the hits_policy_errors to set
	 */
	public void setHits_policy_errors(String hits_policy_errors) {
		this.hits_policy_errors = hits_policy_errors;
	}

	/**
	 * @return the hits_routing_errors
	 */
	public String getHits_routing_errors() {
		return hits_routing_errors;
	}

	/**
	 * @param hits_routing_errors the hits_routing_errors to set
	 */
	public void setHits_routing_errors(String hits_routing_errors) {
		this.hits_routing_errors = hits_routing_errors;
	}

	/**
	 * @return the api_key
	 */
	public String getApi_key() {
		return api_key;
	}

	/**
	 * @param api_key the api_key to set
	 */
	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}

	/**
	 * @return the api_method
	 */
	public String getApi_method() {
		return api_method;
	}

	/**
	 * @param api_method the api_method to set
	 */
	public void setApi_method(String api_method) {
		this.api_method = api_method;
	}

}
