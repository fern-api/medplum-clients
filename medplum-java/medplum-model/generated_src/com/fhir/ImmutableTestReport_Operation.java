//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TestReport_Operation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestReport_Operation.builder()}.
 */
@org.immutables.value.Generated(from = "TestReport_Operation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestReport_Operation implements com.fhir.TestReport_Operation {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.uri detail;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown message;
  private final @javax.annotation.Nullable com.fhir.Testreport_operationResult result;

  private ImmutableTestReport_Operation(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.uri detail,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown message,
      @javax.annotation.Nullable com.fhir.Testreport_operationResult result) {
    this.id = id;
    this.detail = detail;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.message = message;
    this.result = result;
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
   * @return The value of the {@code detail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detail")
  @Override
  public java.util.Optional<com.fhir.uri> detail() {
    return java.util.Optional.ofNullable(detail);
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
   * @return The value of the {@code message} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  @Override
  public java.util.Optional<com.fhir.markdown> message() {
    return java.util.Optional.ofNullable(message);
  }

  /**
   * @return The value of the {@code result} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("result")
  @Override
  public java.util.Optional<com.fhir.Testreport_operationResult> result() {
    return java.util.Optional.ofNullable(result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestReport_Operation(newValue, this.detail, this.extension, this.modifierExtension, this.message, this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableTestReport_Operation(value, this.detail, this.extension, this.modifierExtension, this.message, this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withDetail(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableTestReport_Operation(this.id, newValue, this.extension, this.modifierExtension, this.message, this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withDetail(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableTestReport_Operation(this.id, value, this.extension, this.modifierExtension, this.message, this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestReport_Operation(this.id, this.detail, newValue, this.modifierExtension, this.message, this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestReport_Operation(this.id, this.detail, value, this.modifierExtension, this.message, this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestReport_Operation(this.id, this.detail, this.extension, newValue, this.message, this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestReport_Operation(this.id, this.detail, this.extension, value, this.message, this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#message() message} attribute.
   * @param value The value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withMessage(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "message");
    if (this.message == newValue) return this;
    return new ImmutableTestReport_Operation(this.id, this.detail, this.extension, this.modifierExtension, newValue, this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#message() message} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for message
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withMessage(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.message == value) return this;
    return new ImmutableTestReport_Operation(this.id, this.detail, this.extension, this.modifierExtension, value, this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#result() result} attribute.
   * @param value The value for result
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withResult(com.fhir.Testreport_operationResult value) {
    @javax.annotation.Nullable com.fhir.Testreport_operationResult newValue = java.util.Objects.requireNonNull(value, "result");
    if (this.result == newValue) return this;
    return new ImmutableTestReport_Operation(this.id, this.detail, this.extension, this.modifierExtension, this.message, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#result() result} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for result
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withResult(java.util.Optional<? extends com.fhir.Testreport_operationResult> optional) {
    @javax.annotation.Nullable com.fhir.Testreport_operationResult value = optional.orElse(null);
    if (this.result == value) return this;
    return new ImmutableTestReport_Operation(this.id, this.detail, this.extension, this.modifierExtension, this.message, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestReport_Operation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestReport_Operation
        && equalTo((ImmutableTestReport_Operation) another);
  }

  private boolean equalTo(ImmutableTestReport_Operation another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(detail, another.detail)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(message, another.message)
        && java.util.Objects.equals(result, another.result);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code detail}, {@code extension}, {@code modifierExtension}, {@code message}, {@code result}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(detail);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(message);
    h += (h << 5) + java.util.Objects.hashCode(result);
    return h;
  }

  /**
   * Prints the immutable value {@code TestReport_Operation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TestReport_Operation{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (detail != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (message != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("message=").append(message);
    }
    if (result != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("result=").append(result);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "TestReport_Operation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TestReport_Operation {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> detail = java.util.Optional.empty();
    boolean detailIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> message = java.util.Optional.empty();
    boolean messageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Testreport_operationResult> result = java.util.Optional.empty();
    boolean resultIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public void setDetail(java.util.Optional<com.fhir.uri> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
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
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    public void setMessage(java.util.Optional<com.fhir.markdown> message) {
      this.message = message;
      this.messageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    public void setResult(java.util.Optional<com.fhir.Testreport_operationResult> result) {
      this.result = result;
      this.resultIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> detail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> message() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Testreport_operationResult> result() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTestReport_Operation fromJson(Json json) {
    ImmutableTestReport_Operation.Builder builder = ImmutableTestReport_Operation.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.messageIsSet) {
      builder.message(json.message);
    }
    if (json.resultIsSet) {
      builder.result(json.result);
    }
    return (ImmutableTestReport_Operation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestReport_Operation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestReport_Operation instance
   */
  public static TestReport_Operation copyOf(TestReport_Operation instance) {
    if (instance instanceof ImmutableTestReport_Operation) {
      return (ImmutableTestReport_Operation) instance;
    }
    return ImmutableTestReport_Operation.builder()
        .id(instance.id())
        .detail(instance.detail())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .message(instance.message())
        .result(instance.result())
        .build();
  }

  /**
   * Creates a builder for {@link TestReport_Operation TestReport_Operation}.
   * <pre>
   * ImmutableTestReport_Operation.builder()
   *    .id(String) // optional {@link TestReport_Operation#id() id}
   *    .detail(com.fhir.uri) // optional {@link TestReport_Operation#detail() detail}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestReport_Operation#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestReport_Operation#modifierExtension() modifierExtension}
   *    .message(com.fhir.markdown) // optional {@link TestReport_Operation#message() message}
   *    .result(com.fhir.Testreport_operationResult) // optional {@link TestReport_Operation#result() result}
   *    .build();
   * </pre>
   * @return A new TestReport_Operation builder
   */
  public static ImmutableTestReport_Operation.Builder builder() {
    return new ImmutableTestReport_Operation.Builder();
  }

  /**
   * Builds instances of type {@link TestReport_Operation TestReport_Operation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "TestReport_Operation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_DETAIL = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_MESSAGE = 0x10L;
    private static final long OPT_BIT_RESULT = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.uri detail;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown message;
    private @javax.annotation.Nullable com.fhir.Testreport_operationResult result;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#id() id} to id.
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
     * Initializes the optional value {@link TestReport_Operation#id() id} to id.
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
     * Initializes the optional value {@link TestReport_Operation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(com.fhir.uri detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = java.util.Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public final Builder detail(java.util.Optional<? extends com.fhir.uri> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#extension() extension} to extension.
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
     * Initializes the optional value {@link TestReport_Operation#extension() extension} to extension.
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
     * Initializes the optional value {@link TestReport_Operation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestReport_Operation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestReport_Operation#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for chained invocation
     */
    public final Builder message(com.fhir.markdown message) {
      checkNotIsSet(messageIsSet(), "message");
      this.message = java.util.Objects.requireNonNull(message, "message");
      optBits |= OPT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    public final Builder message(java.util.Optional<? extends com.fhir.markdown> message) {
      checkNotIsSet(messageIsSet(), "message");
      this.message = message.orElse(null);
      optBits |= OPT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    public final Builder result(com.fhir.Testreport_operationResult result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = java.util.Objects.requireNonNull(result, "result");
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    public final Builder result(java.util.Optional<? extends com.fhir.Testreport_operationResult> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = result.orElse(null);
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Builds a new {@link TestReport_Operation TestReport_Operation}.
     * @return An immutable instance of TestReport_Operation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TestReport_Operation build() {
      return new ImmutableTestReport_Operation(id, detail, extension, modifierExtension, message, result);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean messageIsSet() {
      return (optBits & OPT_BIT_MESSAGE) != 0;
    }

    private boolean resultIsSet() {
      return (optBits & OPT_BIT_RESULT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TestReport_Operation is strict, attribute is already set: ".concat(name));
    }
  }
}
