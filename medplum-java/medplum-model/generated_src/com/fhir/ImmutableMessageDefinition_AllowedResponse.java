//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MessageDefinition_AllowedResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageDefinition_AllowedResponse.builder()}.
 */
@org.immutables.value.Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageDefinition_AllowedResponse
    implements com.fhir.MessageDefinition_AllowedResponse {
  private final com.fhir.canonical message;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.markdown situation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableMessageDefinition_AllowedResponse(
      com.fhir.canonical message,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.markdown situation,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String id) {
    this.message = message;
    this.extension = extension;
    this.situation = situation;
    this.modifierExtension = modifierExtension;
    this.id = id;
  }

  /**
   * @return The value of the {@code message} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  @Override
  public com.fhir.canonical message() {
    return message;
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
   * @return The value of the {@code situation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("situation")
  @Override
  public java.util.Optional<com.fhir.markdown> situation() {
    return java.util.Optional.ofNullable(situation);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MessageDefinition_AllowedResponse#message() message} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for message
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withMessage(com.fhir.canonical value) {
    if (this.message == value) return this;
    com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "message");
    return new ImmutableMessageDefinition_AllowedResponse(newValue, this.extension, this.situation, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_AllowedResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.message, newValue, this.situation, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_AllowedResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_AllowedResponse withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.message, value, this.situation, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_AllowedResponse#situation() situation} attribute.
   * @param value The value for situation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withSituation(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "situation");
    if (this.situation == newValue) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.message, this.extension, newValue, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_AllowedResponse#situation() situation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for situation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_AllowedResponse withSituation(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.situation == value) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.message, this.extension, value, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.message, this.extension, this.situation, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_AllowedResponse withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.message, this.extension, this.situation, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_AllowedResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.message, this.extension, this.situation, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_AllowedResponse#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.message, this.extension, this.situation, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageDefinition_AllowedResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageDefinition_AllowedResponse
        && equalTo((ImmutableMessageDefinition_AllowedResponse) another);
  }

  private boolean equalTo(ImmutableMessageDefinition_AllowedResponse another) {
    return message.equals(another.message)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(situation, another.situation)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code message}, {@code extension}, {@code situation}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + message.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(situation);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageDefinition_AllowedResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MessageDefinition_AllowedResponse{");
    builder.append("message=").append(message);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (situation != null) {
      builder.append(", ");
      builder.append("situation=").append(situation);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MessageDefinition_AllowedResponse {
    @javax.annotation.Nullable com.fhir.canonical message;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> situation = java.util.Optional.empty();
    boolean situationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    public void setMessage(com.fhir.canonical message) {
      this.message = message;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("situation")
    public void setSituation(java.util.Optional<com.fhir.markdown> situation) {
      this.situation = situation;
      this.situationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public com.fhir.canonical message() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> situation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMessageDefinition_AllowedResponse fromJson(Json json) {
    ImmutableMessageDefinition_AllowedResponse.Builder builder = ((ImmutableMessageDefinition_AllowedResponse.Builder) ImmutableMessageDefinition_AllowedResponse.builder());
    if (json.message != null) {
      builder.message(json.message);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.situationIsSet) {
      builder.situation(json.situation);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableMessageDefinition_AllowedResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageDefinition_AllowedResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageDefinition_AllowedResponse instance
   */
  public static MessageDefinition_AllowedResponse copyOf(MessageDefinition_AllowedResponse instance) {
    if (instance instanceof ImmutableMessageDefinition_AllowedResponse) {
      return (ImmutableMessageDefinition_AllowedResponse) instance;
    }
    return ((ImmutableMessageDefinition_AllowedResponse.Builder) ImmutableMessageDefinition_AllowedResponse.builder())
        .message(instance.message())
        .extension(instance.extension())
        .situation(instance.situation())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link MessageDefinition_AllowedResponse MessageDefinition_AllowedResponse}.
   * <pre>
   * ImmutableMessageDefinition_AllowedResponse.builder()
   *    .message(com.fhir.canonical) // required {@link MessageDefinition_AllowedResponse#message() message}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageDefinition_AllowedResponse#extension() extension}
   *    .situation(com.fhir.markdown) // optional {@link MessageDefinition_AllowedResponse#situation() situation}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link MessageDefinition_AllowedResponse#id() id}
   *    .build();
   * </pre>
   * @return A new MessageDefinition_AllowedResponse builder
   */
  public static MessageBuildStage builder() {
    return new ImmutableMessageDefinition_AllowedResponse.Builder();
  }

  /**
   * Builds instances of type {@link MessageDefinition_AllowedResponse MessageDefinition_AllowedResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements MessageBuildStage, BuildFinal {
    private static final long INIT_BIT_MESSAGE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_SITUATION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.canonical message;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.markdown situation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link MessageDefinition_AllowedResponse#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    public final Builder message(com.fhir.canonical message) {
      checkNotIsSet(messageIsSet(), "message");
      this.message = java.util.Objects.requireNonNull(message, "message");
      initBits &= ~INIT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#situation() situation} to situation.
     * @param situation The value for situation
     * @return {@code this} builder for chained invocation
     */
    public final Builder situation(com.fhir.markdown situation) {
      checkNotIsSet(situationIsSet(), "situation");
      this.situation = java.util.Objects.requireNonNull(situation, "situation");
      optBits |= OPT_BIT_SITUATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#situation() situation} to situation.
     * @param situation The value for situation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("situation")
    public final Builder situation(java.util.Optional<? extends com.fhir.markdown> situation) {
      checkNotIsSet(situationIsSet(), "situation");
      this.situation = situation.orElse(null);
      optBits |= OPT_BIT_SITUATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#id() id} to id.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#id() id} to id.
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
     * Builds a new {@link MessageDefinition_AllowedResponse MessageDefinition_AllowedResponse}.
     * @return An immutable instance of MessageDefinition_AllowedResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MessageDefinition_AllowedResponse build() {
      checkRequiredAttributes();
      return new ImmutableMessageDefinition_AllowedResponse(message, extension, situation, modifierExtension, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean situationIsSet() {
      return (optBits & OPT_BIT_SITUATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean messageIsSet() {
      return (initBits & INIT_BIT_MESSAGE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MessageDefinition_AllowedResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!messageIsSet()) attributes.add("message");
      return "Cannot build MessageDefinition_AllowedResponse, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
  public interface MessageBuildStage {
    /**
     * Initializes the value for the {@link MessageDefinition_AllowedResponse#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal message(com.fhir.canonical message);
  }

  @org.immutables.value.Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#situation() situation} to situation.
     * @param situation The value for situation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal situation(com.fhir.markdown situation);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#situation() situation} to situation.
     * @param situation The value for situation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal situation(java.util.Optional<? extends com.fhir.markdown> situation);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Builds a new {@link MessageDefinition_AllowedResponse MessageDefinition_AllowedResponse}.
     * @return An immutable instance of MessageDefinition_AllowedResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MessageDefinition_AllowedResponse build();
  }
}
