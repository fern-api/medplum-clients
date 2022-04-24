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
 * Immutable implementation of {@link TestScript_Action1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Action1.builder()}.
 */
@Generated(from = "TestScript_Action1", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Action1 implements TestScript_Action1 {
  private final @Nullable TestScript_Operation operation;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable TestScript_Assert _assert;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutableTestScript_Action1(
      @Nullable TestScript_Operation operation,
      @Nullable List<Extension> modifierExtension,
      @Nullable TestScript_Assert _assert,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.operation = operation;
    this.modifierExtension = modifierExtension;
    this._assert = _assert;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public Optional<TestScript_Operation> operation() {
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
   * @return The value of the {@code _assert} attribute
   */
  @JsonProperty("assert")
  @Override
  public Optional<TestScript_Assert> _assert() {
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Action1#operation() operation} attribute.
   * @param value The value for operation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action1 withOperation(TestScript_Operation value) {
    @Nullable TestScript_Operation newValue = Objects.requireNonNull(value, "operation");
    if (this.operation == newValue) return this;
    return new ImmutableTestScript_Action1(newValue, this.modifierExtension, this._assert, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Action1#operation() operation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Action1 withOperation(Optional<? extends TestScript_Operation> optional) {
    @Nullable TestScript_Operation value = optional.orElse(null);
    if (this.operation == value) return this;
    return new ImmutableTestScript_Action1(value, this.modifierExtension, this._assert, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Action1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action1 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Action1(this.operation, newValue, this._assert, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Action1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Action1 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Action1(this.operation, value, this._assert, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Action1#_assert() _assert} attribute.
   * @param value The value for _assert
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action1 with_assert(TestScript_Assert value) {
    @Nullable TestScript_Assert newValue = Objects.requireNonNull(value, "_assert");
    if (this._assert == newValue) return this;
    return new ImmutableTestScript_Action1(this.operation, this.modifierExtension, newValue, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Action1#_assert() _assert} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _assert
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Action1 with_assert(Optional<? extends TestScript_Assert> optional) {
    @Nullable TestScript_Assert value = optional.orElse(null);
    if (this._assert == value) return this;
    return new ImmutableTestScript_Action1(this.operation, this.modifierExtension, value, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Action1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action1 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Action1(this.operation, this.modifierExtension, this._assert, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Action1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action1 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Action1(this.operation, this.modifierExtension, this._assert, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Action1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action1 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Action1(this.operation, this.modifierExtension, this._assert, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Action1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Action1 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Action1(this.operation, this.modifierExtension, this._assert, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Action1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Action1
        && equalTo((ImmutableTestScript_Action1) another);
  }

  private boolean equalTo(ImmutableTestScript_Action1 another) {
    return Objects.equals(operation, another.operation)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(_assert, another._assert)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code operation}, {@code modifierExtension}, {@code _assert}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(operation);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(_assert);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Action1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Action1{");
    if (operation != null) {
      builder.append("operation=").append(operation);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (_assert != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("_assert=").append(_assert);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestScript_Action1", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Action1 {
    @Nullable Optional<TestScript_Operation> operation = Optional.empty();
    boolean operationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<TestScript_Assert> _assert = Optional.empty();
    boolean _assertIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("operation")
    public void setOperation(Optional<TestScript_Operation> operation) {
      this.operation = operation;
      this.operationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("assert")
    public void set_assert(Optional<TestScript_Assert> _assert) {
      this._assert = _assert;
      this._assertIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<TestScript_Operation> operation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestScript_Assert> _assert() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableTestScript_Action1 fromJson(Json json) {
    ImmutableTestScript_Action1.Builder builder = ImmutableTestScript_Action1.builder();
    if (json.operationIsSet) {
      builder.operation(json.operation);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json._assertIsSet) {
      builder._assert(json._assert);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableTestScript_Action1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Action1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Action1 instance
   */
  public static TestScript_Action1 copyOf(TestScript_Action1 instance) {
    if (instance instanceof ImmutableTestScript_Action1) {
      return (ImmutableTestScript_Action1) instance;
    }
    return ImmutableTestScript_Action1.builder()
        .operation(instance.operation())
        .modifierExtension(instance.modifierExtension())
        ._assert(instance._assert())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Action1 TestScript_Action1}.
   * <pre>
   * ImmutableTestScript_Action1.builder()
   *    .operation(com.fhir.TestScript_Operation) // optional {@link TestScript_Action1#operation() operation}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Action1#modifierExtension() modifierExtension}
   *    ._assert(com.fhir.TestScript_Assert) // optional {@link TestScript_Action1#_assert() _assert}
   *    .id(String) // optional {@link TestScript_Action1#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Action1#extension() extension}
   *    .build();
   * </pre>
   * @return A new TestScript_Action1 builder
   */
  public static ImmutableTestScript_Action1.Builder builder() {
    return new ImmutableTestScript_Action1.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Action1 TestScript_Action1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestScript_Action1", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_OPERATION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT__ASSERT = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable TestScript_Operation operation;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable TestScript_Assert _assert;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Action1#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for chained invocation
     */
    public final Builder operation(TestScript_Operation operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = Objects.requireNonNull(operation, "operation");
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Action1#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(Optional<? extends TestScript_Operation> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = operation.orElse(null);
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Action1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Action1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Action1#_assert() _assert} to _assert.
     * @param _assert The value for _assert
     * @return {@code this} builder for chained invocation
     */
    public final Builder _assert(TestScript_Assert _assert) {
      checkNotIsSet(_assertIsSet(), "_assert");
      this._assert = Objects.requireNonNull(_assert, "_assert");
      optBits |= OPT_BIT__ASSERT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Action1#_assert() _assert} to _assert.
     * @param _assert The value for _assert
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assert")
    public final Builder _assert(Optional<? extends TestScript_Assert> _assert) {
      checkNotIsSet(_assertIsSet(), "_assert");
      this._assert = _assert.orElse(null);
      optBits |= OPT_BIT__ASSERT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Action1#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Action1#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Action1#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Action1#extension() extension} to extension.
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
     * Builds a new {@link TestScript_Action1 TestScript_Action1}.
     * @return An immutable instance of TestScript_Action1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_Action1 build() {
      return new ImmutableTestScript_Action1(operation, modifierExtension, _assert, id, extension);
    }

    private boolean operationIsSet() {
      return (optBits & OPT_BIT_OPERATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean _assertIsSet() {
      return (optBits & OPT_BIT__ASSERT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Action1 is strict, attribute is already set: ".concat(name));
    }
  }
}
