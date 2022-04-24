//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Bundle_Response}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle_Response.builder()}.
 */
@org.immutables.value.Generated(from = "Bundle_Response", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle_Response implements com.fhir.Bundle_Response {
  private final @javax.annotation.Nullable java.lang.String status;
  private final @javax.annotation.Nullable java.lang.String etag;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.ResourceList outcome;
  private final @javax.annotation.Nullable com.fhir.uri location;
  private final @javax.annotation.Nullable com.fhir.instant lastModified;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableBundle_Response(
      @javax.annotation.Nullable java.lang.String status,
      @javax.annotation.Nullable java.lang.String etag,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.ResourceList outcome,
      @javax.annotation.Nullable com.fhir.uri location,
      @javax.annotation.Nullable com.fhir.instant lastModified,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.status = status;
    this.etag = etag;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.outcome = outcome;
    this.location = location;
    this.lastModified = lastModified;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<java.lang.String> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code etag} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("etag")
  @Override
  public java.util.Optional<java.lang.String> etag() {
    return java.util.Optional.ofNullable(etag);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.ResourceList> outcome() {
    return java.util.Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<com.fhir.uri> location() {
    return java.util.Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code lastModified} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastModified")
  @Override
  public java.util.Optional<com.fhir.instant> lastModified() {
    return java.util.Optional.ofNullable(lastModified);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withStatus(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "status");
    if (java.util.Objects.equals(this.status, newValue)) return this;
    return new ImmutableBundle_Response(
        newValue,
        this.etag,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#status() status} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withStatus(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.status, value)) return this;
    return new ImmutableBundle_Response(
        value,
        this.etag,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#etag() etag} attribute.
   * @param value The value for etag
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withEtag(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "etag");
    if (java.util.Objects.equals(this.etag, newValue)) return this;
    return new ImmutableBundle_Response(
        this.status,
        newValue,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#etag() etag} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for etag
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withEtag(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.etag, value)) return this;
    return new ImmutableBundle_Response(
        this.status,
        value,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        newValue,
        this.modifierExtension,
        this.outcome,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        value,
        this.modifierExtension,
        this.outcome,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        newValue,
        this.outcome,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        value,
        this.outcome,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withOutcome(com.fhir.ResourceList value) {
    @javax.annotation.Nullable com.fhir.ResourceList newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        this.modifierExtension,
        newValue,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withOutcome(java.util.Optional<? extends com.fhir.ResourceList> optional) {
    @javax.annotation.Nullable com.fhir.ResourceList value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        this.modifierExtension,
        value,
        this.location,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withLocation(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        this.modifierExtension,
        this.outcome,
        newValue,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withLocation(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        this.modifierExtension,
        this.outcome,
        value,
        this.lastModified,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#lastModified() lastModified} attribute.
   * @param value The value for lastModified
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withLastModified(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "lastModified");
    if (this.lastModified == newValue) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.location,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#lastModified() lastModified} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastModified
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withLastModified(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.lastModified == value) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.location,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.location,
        this.lastModified,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBundle_Response(
        this.status,
        this.etag,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.location,
        this.lastModified,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle_Response} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle_Response
        && equalTo((ImmutableBundle_Response) another);
  }

  private boolean equalTo(ImmutableBundle_Response another) {
    return java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(etag, another.etag)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(lastModified, another.lastModified)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code etag}, {@code id}, {@code modifierExtension}, {@code outcome}, {@code location}, {@code lastModified}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(etag);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(lastModified);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle_Response} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Bundle_Response{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (etag != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("etag=").append(etag);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (outcome != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (location != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (lastModified != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("lastModified=").append(lastModified);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Bundle_Response", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Bundle_Response {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> etag = java.util.Optional.empty();
    boolean etagIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ResourceList> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> lastModified = java.util.Optional.empty();
    boolean lastModifiedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<java.lang.String> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    public void setEtag(java.util.Optional<java.lang.String> etag) {
      this.etag = etag;
      this.etagIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.ResourceList> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.uri> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastModified")
    public void setLastModified(java.util.Optional<com.fhir.instant> lastModified) {
      this.lastModified = lastModified;
      this.lastModifiedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> etag() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ResourceList> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> lastModified() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableBundle_Response fromJson(Json json) {
    ImmutableBundle_Response.Builder builder = ImmutableBundle_Response.builder();
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.etagIsSet) {
      builder.etag(json.etag);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.lastModifiedIsSet) {
      builder.lastModified(json.lastModified);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableBundle_Response) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bundle_Response} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bundle_Response instance
   */
  public static Bundle_Response copyOf(Bundle_Response instance) {
    if (instance instanceof ImmutableBundle_Response) {
      return (ImmutableBundle_Response) instance;
    }
    return ImmutableBundle_Response.builder()
        .status(instance.status())
        .etag(instance.etag())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .outcome(instance.outcome())
        .location(instance.location())
        .lastModified(instance.lastModified())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle_Response Bundle_Response}.
   * <pre>
   * ImmutableBundle_Response.builder()
   *    .status(String) // optional {@link Bundle_Response#status() status}
   *    .etag(String) // optional {@link Bundle_Response#etag() etag}
   *    .id(String) // optional {@link Bundle_Response#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Bundle_Response#modifierExtension() modifierExtension}
   *    .outcome(com.fhir.ResourceList) // optional {@link Bundle_Response#outcome() outcome}
   *    .location(com.fhir.uri) // optional {@link Bundle_Response#location() location}
   *    .lastModified(com.fhir.instant) // optional {@link Bundle_Response#lastModified() lastModified}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Bundle_Response#extension() extension}
   *    .build();
   * </pre>
   * @return A new Bundle_Response builder
   */
  public static ImmutableBundle_Response.Builder builder() {
    return new ImmutableBundle_Response.Builder();
  }

  /**
   * Builds instances of type {@link Bundle_Response Bundle_Response}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Bundle_Response", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_ETAG = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_OUTCOME = 0x10L;
    private static final long OPT_BIT_LOCATION = 0x20L;
    private static final long OPT_BIT_LAST_MODIFIED = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String status;
    private @javax.annotation.Nullable java.lang.String etag;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.ResourceList outcome;
    private @javax.annotation.Nullable com.fhir.uri location;
    private @javax.annotation.Nullable com.fhir.instant lastModified;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle_Response#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(java.lang.String status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<java.lang.String> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#etag() etag} to etag.
     * @param etag The value for etag
     * @return {@code this} builder for chained invocation
     */
    public final Builder etag(java.lang.String etag) {
      checkNotIsSet(etagIsSet(), "etag");
      this.etag = java.util.Objects.requireNonNull(etag, "etag");
      optBits |= OPT_BIT_ETAG;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#etag() etag} to etag.
     * @param etag The value for etag
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    public final Builder etag(java.util.Optional<java.lang.String> etag) {
      checkNotIsSet(etagIsSet(), "etag");
      this.etag = etag.orElse(null);
      optBits |= OPT_BIT_ETAG;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Response#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Response#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Response#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Response#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(com.fhir.ResourceList outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends com.fhir.ResourceList> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(com.fhir.uri location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends com.fhir.uri> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastModified(com.fhir.instant lastModified) {
      checkNotIsSet(lastModifiedIsSet(), "lastModified");
      this.lastModified = java.util.Objects.requireNonNull(lastModified, "lastModified");
      optBits |= OPT_BIT_LAST_MODIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastModified")
    public final Builder lastModified(java.util.Optional<? extends com.fhir.instant> lastModified) {
      checkNotIsSet(lastModifiedIsSet(), "lastModified");
      this.lastModified = lastModified.orElse(null);
      optBits |= OPT_BIT_LAST_MODIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Response#extension() extension} to extension.
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
     * Builds a new {@link Bundle_Response Bundle_Response}.
     * @return An immutable instance of Bundle_Response
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Bundle_Response build() {
      return new ImmutableBundle_Response(status, etag, id, modifierExtension, outcome, location, lastModified, extension);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean etagIsSet() {
      return (optBits & OPT_BIT_ETAG) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean lastModifiedIsSet() {
      return (optBits & OPT_BIT_LAST_MODIFIED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Bundle_Response is strict, attribute is already set: ".concat(name));
    }
  }
}
