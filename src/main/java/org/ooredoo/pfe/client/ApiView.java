package org.ooredoo.pfe.client;
import com.google.gwt.user.client.rpc.IsSerializable;


public class ApiView implements IsSerializable {

	private String id;
	private String metric_id;
	private String uuid;
	private String api_id;
	private String api_name;
	private String api_uri;
	private String resolution;
	private String bin_start_time;
	private String bin_end_time;
	private String front_min;
	private String front_max;
	private String front_sum;
	private String back_min;
	private String back_max;
	private String back_sum;
	private String hits_total;
	private String hits_success;
	private String hits_total_errors;
	private String hits_policy_errors;
	private String hits_routing_errors;
	private String api_key;
	private String api_method;

    public ApiView() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

	public String getMetric_id() {
		return metric_id;
	}

	public void setMetric_id(String metric_id) {
		this.metric_id = metric_id;
	}
}
