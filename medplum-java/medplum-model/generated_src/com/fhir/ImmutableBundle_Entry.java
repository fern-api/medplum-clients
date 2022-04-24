//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Bundle_Entry}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle_Entry.builder()}.
 */
@org.immutables.value.Generated(from = "Bundle_Entry", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle_Entry implements com.fhir.Bundle_Entry {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.ResourceList resource;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> link;
  private final @javax.annotation.Nullable com.fhir.Bundle_Search search;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Bundle_Response response;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri fullUrl;
  private final @javax.annotation.Nullable com.fhir.Bundle_Request request;

  private ImmutableBundle_Entry(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.ResourceList resource,
      @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> link,
      @javax.annotation.Nullable com.fhir.Bundle_Search search,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Bundle_Response response,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri fullUrl,
      @javax.annotation.Nullable com.fhir.Bundle_Request request) {
    this.id = id;
    this.resource = resource;
    this.link = link;
    this.search = search;
    this.extension = extension;
    this.response = response;
    this.modifierExtension = modifierExtension;
    this.fullUrl = fullUrl;
    this.request = request;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<com.fhir.ResourceList> resource() {
    return java.util.Optional.ofNullable(resource);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("link")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Bundle_Link>> link() {
    return java.util.Optional.ofNullable(link);
  }

  /**
   * @return The value of the {@code search} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("search")
  @Override
  public java.util.Optional<com.fhir.Bundle_Search> search() {
    return java.util.Optional.ofNullable(search);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("response")
  @Override
  public java.util.Optional<com.fhir.Bundle_Response> response() {
    return java.util.Optional.ofNullable(response);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code fullUrl} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fullUrl")
  @Override
  public java.util.Optional<com.fhir.uri> fullUrl() {
    return java.util.Optional.ofNullable(fullUrl);
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("request")
  @Override
  public java.util.Optional<com.fhir.Bundle_Request> request() {
    return java.util.Optional.ofNullable(request);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableBundle_Entry(
        newValue,
        this.resource,
        this.link,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableBundle_Entry(
        value,
        this.resource,
        this.link,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withResource(com.fhir.ResourceList value) {
    @javax.annotation.Nullable com.fhir.ResourceList newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableBundle_Entry(
        this.id,
        newValue,
        this.link,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withResource(java.util.Optional<? extends com.fhir.ResourceList> optional) {
    @javax.annotation.Nullable com.fhir.ResourceList value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableBundle_Entry(
        this.id,
        value,
        this.link,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withLink(java.util.List<com.fhir.Bundle_Link> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> newValue = java.util.Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        newValue,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withLink(java.util.Optional<? extends java.util.List<com.fhir.Bundle_Link>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        value,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#search() search} attribute.
   * @param value The value for search
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withSearch(com.fhir.Bundle_Search value) {
    @javax.annotation.Nullable com.fhir.Bundle_Search newValue = java.util.Objects.requireNonNull(value, "search");
    if (this.search == newValue) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        newValue,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#search() search} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for search
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withSearch(java.util.Optional<? extends com.fhir.Bundle_Search> optional) {
    @javax.annotation.Nullable com.fhir.Bundle_Search value = optional.orElse(null);
    if (this.search == value) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        value,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        newValue,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        value,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withResponse(com.fhir.Bundle_Response value) {
    @javax.annotation.Nullable com.fhir.Bundle_Response newValue = java.util.Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        this.extension,
        newValue,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withResponse(java.util.Optional<? extends com.fhir.Bundle_Response> optional) {
    @javax.annotation.Nullable com.fhir.Bundle_Response value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        this.extension,
        value,
        this.modifierExtension,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        this.extension,
        this.response,
        newValue,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        this.extension,
        this.response,
        value,
        this.fullUrl,
        this.request);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#fullUrl() fullUrl} attribute.
   * @param value The value for fullUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withFullUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "fullUrl");
    if (this.fullUrl == newValue) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        newValue,
        this.request);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#fullUrl() fullUrl} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fullUrl
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withFullUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.fullUrl == value) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        value,
        this.request);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withRequest(com.fhir.Bundle_Request value) {
    @javax.annotation.Nullable com.fhir.Bundle_Request newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withRequest(java.util.Optional<? extends com.fhir.Bundle_Request> optional) {
    @javax.annotation.Nullable com.fhir.Bundle_Request value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableBundle_Entry(
        this.id,
        this.resource,
        this.link,
        this.search,
        this.extension,
        this.response,
        this.modifierExtension,
        this.fullUrl,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle_Entry} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle_Entry
        && equalTo((ImmutableBundle_Entry) another);
  }

  private boolean equalTo(ImmutableBundle_Entry another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(resource, another.resource)
        && java.util.Objects.equals(link, another.link)
        && java.util.Objects.equals(search, another.search)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(response, another.response)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(fullUrl, another.fullUrl)
        && java.util.Objects.equals(request, another.request);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code resource}, {@code link}, {@code search}, {@code extension}, {@code response}, {@code modifierExtension}, {@code fullUrl}, {@code request}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    h += (h << 5) + java.util.Objects.hashCode(link);
    h += (h << 5) + java.util.Objects.hashCode(search);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(response);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(fullUrl);
    h += (h << 5) + java.util.Objects.hashCode(request);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle_Entry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Bundle_Entry{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (resource != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (link != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("link=").append(link);
    }
    if (search != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("search=").append(search);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (response != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("response=").append(response);
    }
    if (modifierExtension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (fullUrl != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("fullUrl=").append(fullUrl);
    }
    if (request != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("request=").append(request);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Bundle_Entry", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Bundle_Entry {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ResourceList> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Bundle_Link>> link = java.util.Optional.empty();
    boolean linkIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Bundle_Search> search = java.util.Optional.empty();
    boolean searchIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Bundle_Response> response = java.util.Optional.empty();
    boolean responseIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> fullUrl = java.util.Optional.empty();
    boolean fullUrlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Bundle_Request> request = java.util.Optional.empty();
    boolean requestIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<com.fhir.ResourceList> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public void setLink(java.util.Optional<java.util.List<com.fhir.Bundle_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("search")
    public void setSearch(java.util.Optional<com.fhir.Bundle_Search> search) {
      this.search = search;
      this.searchIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public void setResponse(java.util.Optional<com.fhir.Bundle_Response> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fullUrl")
    public void setFullUrl(java.util.Optional<com.fhir.uri> fullUrl) {
      this.fullUrl = fullUrl;
      this.fullUrlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<com.fhir.Bundle_Request> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ResourceList> resource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Bundle_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Bundle_Search> search() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Bundle_Response> response() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> fullUrl() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Bundle_Request> request() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableBundle_Entry fromJson(Json json) {
    ImmutableBundle_Entry.Builder builder = ImmutableBundle_Entry.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.searchIsSet) {
      builder.search(json.search);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.fullUrlIsSet) {
      builder.fullUrl(json.fullUrl);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    return (ImmutableBundle_Entry) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bundle_Entry} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bundle_Entry instance
   */
  public static Bundle_Entry copyOf(Bundle_Entry instance) {
    if (instance instanceof ImmutableBundle_Entry) {
      return (ImmutableBundle_Entry) instance;
    }
    return ImmutableBundle_Entry.builder()
        .id(instance.id())
        .resource(instance.resource())
        .link(instance.link())
        .search(instance.search())
        .extension(instance.extension())
        .response(instance.response())
        .modifierExtension(instance.modifierExtension())
        .fullUrl(instance.fullUrl())
        .request(instance.request())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle_Entry Bundle_Entry}.
   * <pre>
   * ImmutableBundle_Entry.builder()
   *    .id(String) // optional {@link Bundle_Entry#id() id}
   *    .resource(com.fhir.ResourceList) // optional {@link Bundle_Entry#resource() resource}
   *    .link(List&amp;lt;com.fhir.Bundle_Link&amp;gt;) // optional {@link Bundle_Entry#link() link}
   *    .search(com.fhir.Bundle_Search) // optional {@link Bundle_Entry#search() search}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Bundle_Entry#extension() extension}
   *    .response(com.fhir.Bundle_Response) // optional {@link Bundle_Entry#response() response}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Bundle_Entry#modifierExtension() modifierExtension}
   *    .fullUrl(com.fhir.uri) // optional {@link Bundle_Entry#fullUrl() fullUrl}
   *    .request(com.fhir.Bundle_Request) // optional {@link Bundle_Entry#request() request}
   *    .build();
   * </pre>
   * @return A new Bundle_Entry builder
   */
  public static ImmutableBundle_Entry.Builder builder() {
    return new ImmutableBundle_Entry.Builder();
  }

  /**
   * Builds instances of type {@link Bundle_Entry Bundle_Entry}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Bundle_Entry", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_RESOURCE = 0x2L;
    private static final long OPT_BIT_LINK = 0x4L;
    private static final long OPT_BIT_SEARCH = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_RESPONSE = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_FULL_URL = 0x80L;
    private static final long OPT_BIT_REQUEST = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.ResourceList resource;
    private @javax.annotation.Nullable java.util.List<com.fhir.Bundle_Link> link;
    private @javax.annotation.Nullable com.fhir.Bundle_Search search;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Bundle_Response response;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri fullUrl;
    private @javax.annotation.Nullable com.fhir.Bundle_Request request;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(com.fhir.ResourceList resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends com.fhir.ResourceList> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(java.util.List<com.fhir.Bundle_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = java.util.Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public final Builder link(java.util.Optional<? extends java.util.List<com.fhir.Bundle_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for chained invocation
     */
    public final Builder search(com.fhir.Bundle_Search search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = java.util.Objects.requireNonNull(search, "search");
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("search")
    public final Builder search(java.util.Optional<? extends com.fhir.Bundle_Search> search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = search.orElse(null);
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(com.fhir.Bundle_Response response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = java.util.Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public final Builder response(java.util.Optional<? extends com.fhir.Bundle_Response> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#fullUrl() fullUrl} to fullUrl.
     * @param fullUrl The value for fullUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder fullUrl(com.fhir.uri fullUrl) {
      checkNotIsSet(fullUrlIsSet(), "fullUrl");
      this.fullUrl = java.util.Objects.requireNonNull(fullUrl, "fullUrl");
      optBits |= OPT_BIT_FULL_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#fullUrl() fullUrl} to fullUrl.
     * @param fullUrl The value for fullUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fullUrl")
    public final Builder fullUrl(java.util.Optional<? extends com.fhir.uri> fullUrl) {
      checkNotIsSet(fullUrlIsSet(), "fullUrl");
      this.fullUrl = fullUrl.orElse(null);
      optBits |= OPT_BIT_FULL_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(com.fhir.Bundle_Request request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = java.util.Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public final Builder request(java.util.Optional<? extends com.fhir.Bundle_Request> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Builds a new {@link Bundle_Entry Bundle_Entry}.
     * @return An immutable instance of Bundle_Entry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Bundle_Entry build() {
      return new ImmutableBundle_Entry(id, resource, link, search, extension, response, modifierExtension, fullUrl, request);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean searchIsSet() {
      return (optBits & OPT_BIT_SEARCH) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean fullUrlIsSet() {
      return (optBits & OPT_BIT_FULL_URL) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Bundle_Entry is strict, attribute is already set: ".concat(name));
    }
  }
}
