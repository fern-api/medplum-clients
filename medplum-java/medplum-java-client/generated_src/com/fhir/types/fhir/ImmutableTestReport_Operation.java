package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TestReport_Operation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestReport_Operation.builder()}.
 */
@Generated(from = "TestReport_Operation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestReport_Operation implements TestReport_Operation {
  private final @Nullable Markdown message;
  private final @Nullable Uri detail;
  private final @Nullable Testreport_OperationResult result;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;

  private ImmutableTestReport_Operation(
      @Nullable Markdown message,
      @Nullable Uri detail,
      @Nullable Testreport_OperationResult result,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension) {
    this.message = message;
    this.detail = detail;
    this.result = result;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code message} attribute
   */
  @JsonProperty("message")
  @Override
  public Optional<Markdown> message() {
    return Optional.ofNullable(message);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<Uri> detail() {
    return Optional.ofNullable(detail);
  }

  /**
   * @return The value of the {@code result} attribute
   */
  @JsonProperty("result")
  @Override
  public Optional<Testreport_OperationResult> result() {
    return Optional.ofNullable(result);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#message() message} attribute.
   * @param value The value for message
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withMessage(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "message");
    if (this.message == newValue) return this;
    return new ImmutableTestReport_Operation(newValue, this.detail, this.result, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#message() message} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for message
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withMessage(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.message == value) return this;
    return new ImmutableTestReport_Operation(value, this.detail, this.result, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withDetail(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableTestReport_Operation(this.message, newValue, this.result, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withDetail(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableTestReport_Operation(this.message, value, this.result, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#result() result} attribute.
   * @param value The value for result
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withResult(Testreport_OperationResult value) {
    @Nullable Testreport_OperationResult newValue = Objects.requireNonNull(value, "result");
    if (this.result == newValue) return this;
    return new ImmutableTestReport_Operation(this.message, this.detail, newValue, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#result() result} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for result
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withResult(Optional<? extends Testreport_OperationResult> optional) {
    @Nullable Testreport_OperationResult value = optional.orElse(null);
    if (this.result == value) return this;
    return new ImmutableTestReport_Operation(this.message, this.detail, value, this.id, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestReport_Operation(this.message, this.detail, this.result, newValue, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestReport_Operation(this.message, this.detail, this.result, value, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestReport_Operation(this.message, this.detail, this.result, this.id, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestReport_Operation(this.message, this.detail, this.result, this.id, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Operation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Operation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestReport_Operation(this.message, this.detail, this.result, this.id, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Operation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Operation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestReport_Operation(this.message, this.detail, this.result, this.id, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestReport_Operation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestReport_Operation
        && equalTo((ImmutableTestReport_Operation) another);
  }

  private boolean equalTo(ImmutableTestReport_Operation another) {
    return Objects.equals(message, another.message)
        && Objects.equals(detail, another.detail)
        && Objects.equals(result, another.result)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code message}, {@code detail}, {@code result}, {@code id}, {@code modifierExtension}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(message);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + Objects.hashCode(result);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code TestReport_Operation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestReport_Operation{");
    if (message != null) {
      builder.append("message=").append(message);
    }
    if (detail != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (result != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("result=").append(result);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestReport_Operation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestReport_Operation {
    @Nullable Optional<Markdown> message = Optional.empty();
    boolean messageIsSet;
    @Nullable Optional<Uri> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable Optional<Testreport_OperationResult> result = Optional.empty();
    boolean resultIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("message")
    public void setMessage(Optional<Markdown> message) {
      this.message = message;
      this.messageIsSet = true;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<Uri> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("result")
    public void setResult(Optional<Testreport_OperationResult> result) {
      this.result = result;
      this.resultIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Markdown> message() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> detail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Testreport_OperationResult> result() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestReport_Operation fromJson(Json json) {
    ImmutableTestReport_Operation.Builder builder = ImmutableTestReport_Operation.builder();
    if (json.messageIsSet) {
      builder.message(json.message);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.resultIsSet) {
      builder.result(json.result);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .message(instance.message())
        .detail(instance.detail())
        .result(instance.result())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link TestReport_Operation TestReport_Operation}.
   * <pre>
   * ImmutableTestReport_Operation.builder()
   *    .message(com.fhir.types.fhir.Markdown) // optional {@link TestReport_Operation#message() message}
   *    .detail(com.fhir.types.fhir.Uri) // optional {@link TestReport_Operation#detail() detail}
   *    .result(Testreport_OperationResult) // optional {@link TestReport_Operation#result() result}
   *    .id(String) // optional {@link TestReport_Operation#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestReport_Operation#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestReport_Operation#extension() extension}
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
  @Generated(from = "TestReport_Operation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MESSAGE = 0x1L;
    private static final long OPT_BIT_DETAIL = 0x2L;
    private static final long OPT_BIT_RESULT = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable Markdown message;
    private @Nullable Uri detail;
    private @Nullable Testreport_OperationResult result;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for chained invocation
     */
    public final Builder message(Markdown message) {
      checkNotIsSet(messageIsSet(), "message");
      this.message = Objects.requireNonNull(message, "message");
      optBits |= OPT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#message() message} to message.
     * @param message The value for message
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("message")
    public final Builder message(Optional<? extends Markdown> message) {
      checkNotIsSet(messageIsSet(), "message");
      this.message = message.orElse(null);
      optBits |= OPT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(Uri detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends Uri> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    public final Builder result(Testreport_OperationResult result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = Objects.requireNonNull(result, "result");
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("result")
    public final Builder result(Optional<? extends Testreport_OperationResult> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = result.orElse(null);
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Operation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link TestReport_Operation TestReport_Operation}.
     * @return An immutable instance of TestReport_Operation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestReport_Operation build() {
      return new ImmutableTestReport_Operation(message, detail, result, id, modifierExtension, extension);
    }

    private boolean messageIsSet() {
      return (optBits & OPT_BIT_MESSAGE) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean resultIsSet() {
      return (optBits & OPT_BIT_RESULT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestReport_Operation is strict, attribute is already set: ".concat(name));
    }
  }
}
