//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MessageHeader_Response}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageHeader_Response.builder()}.
 */
@org.immutables.value.Generated(from = "MessageHeader_Response", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageHeader_Response implements com.fhir.MessageHeader_Response {
  private final @javax.annotation.Nullable com.fhir.Messageheader_responseCode code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference details;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.id identifier;

  private ImmutableMessageHeader_Response(
      @javax.annotation.Nullable com.fhir.Messageheader_responseCode code,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference details,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.id identifier) {
    this.code = code;
    this.extension = extension;
    this.details = details;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.Messageheader_responseCode> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code details} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("details")
  @Override
  public java.util.Optional<com.fhir.Reference> details() {
    return java.util.Optional.ofNullable(details);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.id> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withCode(com.fhir.Messageheader_responseCode value) {
    @javax.annotation.Nullable com.fhir.Messageheader_responseCode newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMessageHeader_Response(newValue, this.extension, this.details, this.id, this.modifierExtension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withCode(java.util.Optional<? extends com.fhir.Messageheader_responseCode> optional) {
    @javax.annotation.Nullable com.fhir.Messageheader_responseCode value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMessageHeader_Response(value, this.extension, this.details, this.id, this.modifierExtension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageHeader_Response(this.code, newValue, this.details, this.id, this.modifierExtension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageHeader_Response(this.code, value, this.details, this.id, this.modifierExtension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#details() details} attribute.
   * @param value The value for details
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withDetails(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "details");
    if (this.details == newValue) return this;
    return new ImmutableMessageHeader_Response(this.code, this.extension, newValue, this.id, this.modifierExtension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#details() details} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for details
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withDetails(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.details == value) return this;
    return new ImmutableMessageHeader_Response(this.code, this.extension, value, this.id, this.modifierExtension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMessageHeader_Response(this.code, this.extension, this.details, newValue, this.modifierExtension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMessageHeader_Response(this.code, this.extension, this.details, value, this.modifierExtension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageHeader_Response(this.code, this.extension, this.details, this.id, newValue, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageHeader_Response(this.code, this.extension, this.details, this.id, value, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withIdentifier(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMessageHeader_Response(this.code, this.extension, this.details, this.id, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withIdentifier(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMessageHeader_Response(this.code, this.extension, this.details, this.id, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageHeader_Response} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageHeader_Response
        && equalTo((ImmutableMessageHeader_Response) another);
  }

  private boolean equalTo(ImmutableMessageHeader_Response another) {
    return java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(details, another.details)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code extension}, {@code details}, {@code id}, {@code modifierExtension}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(details);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageHeader_Response} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MessageHeader_Response{");
    if (code != null) {
      builder.append("code=").append(code);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (details != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("details=").append(details);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MessageHeader_Response", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MessageHeader_Response {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Messageheader_responseCode> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> details = java.util.Optional.empty();
    boolean detailsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.Messageheader_responseCode> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    public void setDetails(java.util.Optional<com.fhir.Reference> details) {
      this.details = details;
      this.detailsIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.id> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Messageheader_responseCode> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> details() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMessageHeader_Response fromJson(Json json) {
    ImmutableMessageHeader_Response.Builder builder = ImmutableMessageHeader_Response.builder();
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.detailsIsSet) {
      builder.details(json.details);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableMessageHeader_Response) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageHeader_Response} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageHeader_Response instance
   */
  public static MessageHeader_Response copyOf(MessageHeader_Response instance) {
    if (instance instanceof ImmutableMessageHeader_Response) {
      return (ImmutableMessageHeader_Response) instance;
    }
    return ImmutableMessageHeader_Response.builder()
        .code(instance.code())
        .extension(instance.extension())
        .details(instance.details())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link MessageHeader_Response MessageHeader_Response}.
   * <pre>
   * ImmutableMessageHeader_Response.builder()
   *    .code(com.fhir.Messageheader_responseCode) // optional {@link MessageHeader_Response#code() code}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Response#extension() extension}
   *    .details(com.fhir.Reference) // optional {@link MessageHeader_Response#details() details}
   *    .id(String) // optional {@link MessageHeader_Response#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Response#modifierExtension() modifierExtension}
   *    .identifier(com.fhir.id) // optional {@link MessageHeader_Response#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new MessageHeader_Response builder
   */
  public static ImmutableMessageHeader_Response.Builder builder() {
    return new ImmutableMessageHeader_Response.Builder();
  }

  /**
   * Builds instances of type {@link MessageHeader_Response MessageHeader_Response}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MessageHeader_Response", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_DETAILS = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Messageheader_responseCode code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference details;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.id identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.Messageheader_responseCode code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.Messageheader_responseCode> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader_Response#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader_Response#details() details} to details.
     * @param details The value for details
     * @return {@code this} builder for chained invocation
     */
    public final Builder details(com.fhir.Reference details) {
      checkNotIsSet(detailsIsSet(), "details");
      this.details = java.util.Objects.requireNonNull(details, "details");
      optBits |= OPT_BIT_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#details() details} to details.
     * @param details The value for details
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    public final Builder details(java.util.Optional<? extends com.fhir.Reference> details) {
      checkNotIsSet(detailsIsSet(), "details");
      this.details = details.orElse(null);
      optBits |= OPT_BIT_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader_Response#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader_Response#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader_Response#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader_Response#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.id identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.id> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Builds a new {@link MessageHeader_Response MessageHeader_Response}.
     * @return An immutable instance of MessageHeader_Response
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MessageHeader_Response build() {
      return new ImmutableMessageHeader_Response(code, extension, details, id, modifierExtension, identifier);
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean detailsIsSet() {
      return (optBits & OPT_BIT_DETAILS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MessageHeader_Response is strict, attribute is already set: ".concat(name));
    }
  }
}
