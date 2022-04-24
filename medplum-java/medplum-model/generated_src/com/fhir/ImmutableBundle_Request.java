//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Bundle_Request}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle_Request.builder()}.
 */
@org.immutables.value.Generated(from = "Bundle_Request", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle_Request implements com.fhir.Bundle_Request {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String ifMatch;
  private final @javax.annotation.Nullable java.lang.String ifNoneExist;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.lang.String ifNoneMatch;
  private final @javax.annotation.Nullable com.fhir.Bundle_requestMethod method;
  private final @javax.annotation.Nullable com.fhir.instant ifModifiedSince;

  private ImmutableBundle_Request(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String ifMatch,
      @javax.annotation.Nullable java.lang.String ifNoneExist,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.lang.String ifNoneMatch,
      @javax.annotation.Nullable com.fhir.Bundle_requestMethod method,
      @javax.annotation.Nullable com.fhir.instant ifModifiedSince) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.ifMatch = ifMatch;
    this.ifNoneExist = ifNoneExist;
    this.id = id;
    this.url = url;
    this.ifNoneMatch = ifNoneMatch;
    this.method = method;
    this.ifModifiedSince = ifModifiedSince;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code ifMatch} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ifMatch")
  @Override
  public java.util.Optional<java.lang.String> ifMatch() {
    return java.util.Optional.ofNullable(ifMatch);
  }

  /**
   * @return The value of the {@code ifNoneExist} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ifNoneExist")
  @Override
  public java.util.Optional<java.lang.String> ifNoneExist() {
    return java.util.Optional.ofNullable(ifNoneExist);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code ifNoneMatch} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ifNoneMatch")
  @Override
  public java.util.Optional<java.lang.String> ifNoneMatch() {
    return java.util.Optional.ofNullable(ifNoneMatch);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("method")
  @Override
  public java.util.Optional<com.fhir.Bundle_requestMethod> method() {
    return java.util.Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code ifModifiedSince} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ifModifiedSince")
  @Override
  public java.util.Optional<com.fhir.instant> ifModifiedSince() {
    return java.util.Optional.ofNullable(ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBundle_Request(
        newValue,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBundle_Request(
        value,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBundle_Request(
        this.extension,
        newValue,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBundle_Request(
        this.extension,
        value,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#ifMatch() ifMatch} attribute.
   * @param value The value for ifMatch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfMatch(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "ifMatch");
    if (java.util.Objects.equals(this.ifMatch, newValue)) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        newValue,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#ifMatch() ifMatch} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ifMatch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfMatch(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.ifMatch, value)) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        value,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#ifNoneExist() ifNoneExist} attribute.
   * @param value The value for ifNoneExist
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfNoneExist(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "ifNoneExist");
    if (java.util.Objects.equals(this.ifNoneExist, newValue)) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        newValue,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#ifNoneExist() ifNoneExist} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ifNoneExist
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfNoneExist(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.ifNoneExist, value)) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        value,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        newValue,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        value,
        this.url,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        newValue,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        value,
        this.ifNoneMatch,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#ifNoneMatch() ifNoneMatch} attribute.
   * @param value The value for ifNoneMatch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfNoneMatch(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "ifNoneMatch");
    if (java.util.Objects.equals(this.ifNoneMatch, newValue)) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        newValue,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#ifNoneMatch() ifNoneMatch} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ifNoneMatch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfNoneMatch(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.ifNoneMatch, value)) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        value,
        this.method,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withMethod(com.fhir.Bundle_requestMethod value) {
    @javax.annotation.Nullable com.fhir.Bundle_requestMethod newValue = java.util.Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        newValue,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withMethod(java.util.Optional<? extends com.fhir.Bundle_requestMethod> optional) {
    @javax.annotation.Nullable com.fhir.Bundle_requestMethod value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        value,
        this.ifModifiedSince);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#ifModifiedSince() ifModifiedSince} attribute.
   * @param value The value for ifModifiedSince
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfModifiedSince(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "ifModifiedSince");
    if (this.ifModifiedSince == newValue) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#ifModifiedSince() ifModifiedSince} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ifModifiedSince
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withIfModifiedSince(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.ifModifiedSince == value) return this;
    return new ImmutableBundle_Request(
        this.extension,
        this.modifierExtension,
        this.ifMatch,
        this.ifNoneExist,
        this.id,
        this.url,
        this.ifNoneMatch,
        this.method,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle_Request} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle_Request
        && equalTo((ImmutableBundle_Request) another);
  }

  private boolean equalTo(ImmutableBundle_Request another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(ifMatch, another.ifMatch)
        && java.util.Objects.equals(ifNoneExist, another.ifNoneExist)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(ifNoneMatch, another.ifNoneMatch)
        && java.util.Objects.equals(method, another.method)
        && java.util.Objects.equals(ifModifiedSince, another.ifModifiedSince);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code ifMatch}, {@code ifNoneExist}, {@code id}, {@code url}, {@code ifNoneMatch}, {@code method}, {@code ifModifiedSince}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(ifMatch);
    h += (h << 5) + java.util.Objects.hashCode(ifNoneExist);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(ifNoneMatch);
    h += (h << 5) + java.util.Objects.hashCode(method);
    h += (h << 5) + java.util.Objects.hashCode(ifModifiedSince);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle_Request} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Bundle_Request{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (ifMatch != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("ifMatch=").append(ifMatch);
    }
    if (ifNoneExist != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("ifNoneExist=").append(ifNoneExist);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (url != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (ifNoneMatch != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("ifNoneMatch=").append(ifNoneMatch);
    }
    if (method != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (ifModifiedSince != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("ifModifiedSince=").append(ifModifiedSince);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Bundle_Request", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Bundle_Request {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> ifMatch = java.util.Optional.empty();
    boolean ifMatchIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> ifNoneExist = java.util.Optional.empty();
    boolean ifNoneExistIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> ifNoneMatch = java.util.Optional.empty();
    boolean ifNoneMatchIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Bundle_requestMethod> method = java.util.Optional.empty();
    boolean methodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> ifModifiedSince = java.util.Optional.empty();
    boolean ifModifiedSinceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ifMatch")
    public void setIfMatch(java.util.Optional<java.lang.String> ifMatch) {
      this.ifMatch = ifMatch;
      this.ifMatchIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ifNoneExist")
    public void setIfNoneExist(java.util.Optional<java.lang.String> ifNoneExist) {
      this.ifNoneExist = ifNoneExist;
      this.ifNoneExistIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ifNoneMatch")
    public void setIfNoneMatch(java.util.Optional<java.lang.String> ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      this.ifNoneMatchIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public void setMethod(java.util.Optional<com.fhir.Bundle_requestMethod> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ifModifiedSince")
    public void setIfModifiedSince(java.util.Optional<com.fhir.instant> ifModifiedSince) {
      this.ifModifiedSince = ifModifiedSince;
      this.ifModifiedSinceIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> ifMatch() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> ifNoneExist() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> ifNoneMatch() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Bundle_requestMethod> method() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> ifModifiedSince() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableBundle_Request fromJson(Json json) {
    ImmutableBundle_Request.Builder builder = ImmutableBundle_Request.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.ifMatchIsSet) {
      builder.ifMatch(json.ifMatch);
    }
    if (json.ifNoneExistIsSet) {
      builder.ifNoneExist(json.ifNoneExist);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.ifNoneMatchIsSet) {
      builder.ifNoneMatch(json.ifNoneMatch);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.ifModifiedSinceIsSet) {
      builder.ifModifiedSince(json.ifModifiedSince);
    }
    return (ImmutableBundle_Request) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bundle_Request} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bundle_Request instance
   */
  public static Bundle_Request copyOf(Bundle_Request instance) {
    if (instance instanceof ImmutableBundle_Request) {
      return (ImmutableBundle_Request) instance;
    }
    return ImmutableBundle_Request.builder()
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .ifMatch(instance.ifMatch())
        .ifNoneExist(instance.ifNoneExist())
        .id(instance.id())
        .url(instance.url())
        .ifNoneMatch(instance.ifNoneMatch())
        .method(instance.method())
        .ifModifiedSince(instance.ifModifiedSince())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle_Request Bundle_Request}.
   * <pre>
   * ImmutableBundle_Request.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Bundle_Request#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Bundle_Request#modifierExtension() modifierExtension}
   *    .ifMatch(String) // optional {@link Bundle_Request#ifMatch() ifMatch}
   *    .ifNoneExist(String) // optional {@link Bundle_Request#ifNoneExist() ifNoneExist}
   *    .id(String) // optional {@link Bundle_Request#id() id}
   *    .url(com.fhir.uri) // optional {@link Bundle_Request#url() url}
   *    .ifNoneMatch(String) // optional {@link Bundle_Request#ifNoneMatch() ifNoneMatch}
   *    .method(com.fhir.Bundle_requestMethod) // optional {@link Bundle_Request#method() method}
   *    .ifModifiedSince(com.fhir.instant) // optional {@link Bundle_Request#ifModifiedSince() ifModifiedSince}
   *    .build();
   * </pre>
   * @return A new Bundle_Request builder
   */
  public static ImmutableBundle_Request.Builder builder() {
    return new ImmutableBundle_Request.Builder();
  }

  /**
   * Builds instances of type {@link Bundle_Request Bundle_Request}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Bundle_Request", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_IF_MATCH = 0x4L;
    private static final long OPT_BIT_IF_NONE_EXIST = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_URL = 0x20L;
    private static final long OPT_BIT_IF_NONE_MATCH = 0x40L;
    private static final long OPT_BIT_METHOD = 0x80L;
    private static final long OPT_BIT_IF_MODIFIED_SINCE = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String ifMatch;
    private @javax.annotation.Nullable java.lang.String ifNoneExist;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.lang.String ifNoneMatch;
    private @javax.annotation.Nullable com.fhir.Bundle_requestMethod method;
    private @javax.annotation.Nullable com.fhir.instant ifModifiedSince;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle_Request#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Request#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Request#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Request#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Request#ifMatch() ifMatch} to ifMatch.
     * @param ifMatch The value for ifMatch
     * @return {@code this} builder for chained invocation
     */
    public final Builder ifMatch(java.lang.String ifMatch) {
      checkNotIsSet(ifMatchIsSet(), "ifMatch");
      this.ifMatch = java.util.Objects.requireNonNull(ifMatch, "ifMatch");
      optBits |= OPT_BIT_IF_MATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifMatch() ifMatch} to ifMatch.
     * @param ifMatch The value for ifMatch
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ifMatch")
    public final Builder ifMatch(java.util.Optional<java.lang.String> ifMatch) {
      checkNotIsSet(ifMatchIsSet(), "ifMatch");
      this.ifMatch = ifMatch.orElse(null);
      optBits |= OPT_BIT_IF_MATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifNoneExist() ifNoneExist} to ifNoneExist.
     * @param ifNoneExist The value for ifNoneExist
     * @return {@code this} builder for chained invocation
     */
    public final Builder ifNoneExist(java.lang.String ifNoneExist) {
      checkNotIsSet(ifNoneExistIsSet(), "ifNoneExist");
      this.ifNoneExist = java.util.Objects.requireNonNull(ifNoneExist, "ifNoneExist");
      optBits |= OPT_BIT_IF_NONE_EXIST;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifNoneExist() ifNoneExist} to ifNoneExist.
     * @param ifNoneExist The value for ifNoneExist
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ifNoneExist")
    public final Builder ifNoneExist(java.util.Optional<java.lang.String> ifNoneExist) {
      checkNotIsSet(ifNoneExistIsSet(), "ifNoneExist");
      this.ifNoneExist = ifNoneExist.orElse(null);
      optBits |= OPT_BIT_IF_NONE_EXIST;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Request#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Request#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(com.fhir.uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(java.util.Optional<? extends com.fhir.uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifNoneMatch() ifNoneMatch} to ifNoneMatch.
     * @param ifNoneMatch The value for ifNoneMatch
     * @return {@code this} builder for chained invocation
     */
    public final Builder ifNoneMatch(java.lang.String ifNoneMatch) {
      checkNotIsSet(ifNoneMatchIsSet(), "ifNoneMatch");
      this.ifNoneMatch = java.util.Objects.requireNonNull(ifNoneMatch, "ifNoneMatch");
      optBits |= OPT_BIT_IF_NONE_MATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifNoneMatch() ifNoneMatch} to ifNoneMatch.
     * @param ifNoneMatch The value for ifNoneMatch
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ifNoneMatch")
    public final Builder ifNoneMatch(java.util.Optional<java.lang.String> ifNoneMatch) {
      checkNotIsSet(ifNoneMatchIsSet(), "ifNoneMatch");
      this.ifNoneMatch = ifNoneMatch.orElse(null);
      optBits |= OPT_BIT_IF_NONE_MATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(com.fhir.Bundle_requestMethod method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = java.util.Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public final Builder method(java.util.Optional<? extends com.fhir.Bundle_requestMethod> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifModifiedSince() ifModifiedSince} to ifModifiedSince.
     * @param ifModifiedSince The value for ifModifiedSince
     * @return {@code this} builder for chained invocation
     */
    public final Builder ifModifiedSince(com.fhir.instant ifModifiedSince) {
      checkNotIsSet(ifModifiedSinceIsSet(), "ifModifiedSince");
      this.ifModifiedSince = java.util.Objects.requireNonNull(ifModifiedSince, "ifModifiedSince");
      optBits |= OPT_BIT_IF_MODIFIED_SINCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifModifiedSince() ifModifiedSince} to ifModifiedSince.
     * @param ifModifiedSince The value for ifModifiedSince
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ifModifiedSince")
    public final Builder ifModifiedSince(java.util.Optional<? extends com.fhir.instant> ifModifiedSince) {
      checkNotIsSet(ifModifiedSinceIsSet(), "ifModifiedSince");
      this.ifModifiedSince = ifModifiedSince.orElse(null);
      optBits |= OPT_BIT_IF_MODIFIED_SINCE;
      return this;
    }

    /**
     * Builds a new {@link Bundle_Request Bundle_Request}.
     * @return An immutable instance of Bundle_Request
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Bundle_Request build() {
      return new ImmutableBundle_Request(
          extension,
          modifierExtension,
          ifMatch,
          ifNoneExist,
          id,
          url,
          ifNoneMatch,
          method,
          ifModifiedSince);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean ifMatchIsSet() {
      return (optBits & OPT_BIT_IF_MATCH) != 0;
    }

    private boolean ifNoneExistIsSet() {
      return (optBits & OPT_BIT_IF_NONE_EXIST) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean ifNoneMatchIsSet() {
      return (optBits & OPT_BIT_IF_NONE_MATCH) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean ifModifiedSinceIsSet() {
      return (optBits & OPT_BIT_IF_MODIFIED_SINCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Bundle_Request is strict, attribute is already set: ".concat(name));
    }
  }
}
