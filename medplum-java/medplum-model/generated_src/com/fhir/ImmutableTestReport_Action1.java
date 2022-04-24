package com.fhir;

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
 * Immutable implementation of {@link TestReport_Action1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestReport_Action1.builder()}.
 */
@Generated(from = "TestReport_Action1", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestReport_Action1 implements TestReport_Action1 {
  private final @Nullable List<Extension> extension;
  private final @Nullable TestReport_Assert _assert;
  private final @Nullable String id;
  private final @Nullable TestReport_Operation operation;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableTestReport_Action1(
      @Nullable List<Extension> extension,
      @Nullable TestReport_Assert _assert,
      @Nullable String id,
      @Nullable TestReport_Operation operation,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this._assert = _assert;
    this.id = id;
    this.operation = operation;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code _assert} attribute
   */
  @JsonProperty("assert")
  @Override
  public Optional<TestReport_Assert> _assert() {
    return Optional.ofNullable(_assert);
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
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public Optional<TestReport_Operation> operation() {
    return Optional.ofNullable(operation);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Action1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action1 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestReport_Action1(newValue, this._assert, this.id, this.operation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Action1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Action1 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestReport_Action1(value, this._assert, this.id, this.operation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Action1#_assert() _assert} attribute.
   * @param value The value for _assert
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action1 with_assert(TestReport_Assert value) {
    @Nullable TestReport_Assert newValue = Objects.requireNonNull(value, "_assert");
    if (this._assert == newValue) return this;
    return new ImmutableTestReport_Action1(this.extension, newValue, this.id, this.operation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Action1#_assert() _assert} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _assert
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Action1 with_assert(Optional<? extends TestReport_Assert> optional) {
    @Nullable TestReport_Assert value = optional.orElse(null);
    if (this._assert == value) return this;
    return new ImmutableTestReport_Action1(this.extension, value, this.id, this.operation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Action1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action1 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestReport_Action1(this.extension, this._assert, newValue, this.operation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Action1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action1 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestReport_Action1(this.extension, this._assert, value, this.operation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Action1#operation() operation} attribute.
   * @param value The value for operation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action1 withOperation(TestReport_Operation value) {
    @Nullable TestReport_Operation newValue = Objects.requireNonNull(value, "operation");
    if (this.operation == newValue) return this;
    return new ImmutableTestReport_Action1(this.extension, this._assert, this.id, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Action1#operation() operation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Action1 withOperation(Optional<? extends TestReport_Operation> optional) {
    @Nullable TestReport_Operation value = optional.orElse(null);
    if (this.operation == value) return this;
    return new ImmutableTestReport_Action1(this.extension, this._assert, this.id, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Action1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action1 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestReport_Action1(this.extension, this._assert, this.id, this.operation, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Action1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Action1 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestReport_Action1(this.extension, this._assert, this.id, this.operation, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestReport_Action1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestReport_Action1
        && equalTo((ImmutableTestReport_Action1) another);
  }

  private boolean equalTo(ImmutableTestReport_Action1 another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(_assert, another._assert)
        && Objects.equals(id, another.id)
        && Objects.equals(operation, another.operation)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code _assert}, {@code id}, {@code operation}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(_assert);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(operation);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code TestReport_Action1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestReport_Action1{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (_assert != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("_assert=").append(_assert);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (operation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("operation=").append(operation);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestReport_Action1", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestReport_Action1 {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<TestReport_Assert> _assert = Optional.empty();
    boolean _assertIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<TestReport_Operation> operation = Optional.empty();
    boolean operationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("assert")
    public void set_assert(Optional<TestReport_Assert> _assert) {
      this._assert = _assert;
      this._assertIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("operation")
    public void setOperation(Optional<TestReport_Operation> operation) {
      this.operation = operation;
      this.operationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestReport_Assert> _assert() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestReport_Operation> operation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestReport_Action1 fromJson(Json json) {
    ImmutableTestReport_Action1.Builder builder = ImmutableTestReport_Action1.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json._assertIsSet) {
      builder._assert(json._assert);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.operationIsSet) {
      builder.operation(json.operation);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableTestReport_Action1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestReport_Action1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestReport_Action1 instance
   */
  public static TestReport_Action1 copyOf(TestReport_Action1 instance) {
    if (instance instanceof ImmutableTestReport_Action1) {
      return (ImmutableTestReport_Action1) instance;
    }
    return ImmutableTestReport_Action1.builder()
        .extension(instance.extension())
        ._assert(instance._assert())
        .id(instance.id())
        .operation(instance.operation())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link TestReport_Action1 TestReport_Action1}.
   * <pre>
   * ImmutableTestReport_Action1.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestReport_Action1#extension() extension}
   *    ._assert(com.fhir.TestReport_Assert) // optional {@link TestReport_Action1#_assert() _assert}
   *    .id(String) // optional {@link TestReport_Action1#id() id}
   *    .operation(com.fhir.TestReport_Operation) // optional {@link TestReport_Action1#operation() operation}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestReport_Action1#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new TestReport_Action1 builder
   */
  public static ImmutableTestReport_Action1.Builder builder() {
    return new ImmutableTestReport_Action1.Builder();
  }

  /**
   * Builds instances of type {@link TestReport_Action1 TestReport_Action1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestReport_Action1", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT__ASSERT = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_OPERATION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable TestReport_Assert _assert;
    private @Nullable String id;
    private @Nullable TestReport_Operation operation;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestReport_Action1#extension() extension} to extension.
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
     * Initializes the optional value {@link TestReport_Action1#extension() extension} to extension.
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
     * Initializes the optional value {@link TestReport_Action1#_assert() _assert} to _assert.
     * @param _assert The value for _assert
     * @return {@code this} builder for chained invocation
     */
    public final Builder _assert(TestReport_Assert _assert) {
      checkNotIsSet(_assertIsSet(), "_assert");
      this._assert = Objects.requireNonNull(_assert, "_assert");
      optBits |= OPT_BIT__ASSERT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Action1#_assert() _assert} to _assert.
     * @param _assert The value for _assert
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assert")
    public final Builder _assert(Optional<? extends TestReport_Assert> _assert) {
      checkNotIsSet(_assertIsSet(), "_assert");
      this._assert = _assert.orElse(null);
      optBits |= OPT_BIT__ASSERT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Action1#id() id} to id.
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
     * Initializes the optional value {@link TestReport_Action1#id() id} to id.
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
     * Initializes the optional value {@link TestReport_Action1#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for chained invocation
     */
    public final Builder operation(TestReport_Operation operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = Objects.requireNonNull(operation, "operation");
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Action1#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(Optional<? extends TestReport_Operation> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = operation.orElse(null);
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Action1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestReport_Action1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link TestReport_Action1 TestReport_Action1}.
     * @return An immutable instance of TestReport_Action1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestReport_Action1 build() {
      return new ImmutableTestReport_Action1(extension, _assert, id, operation, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean _assertIsSet() {
      return (optBits & OPT_BIT__ASSERT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean operationIsSet() {
      return (optBits & OPT_BIT_OPERATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestReport_Action1 is strict, attribute is already set: ".concat(name));
    }
  }
}
