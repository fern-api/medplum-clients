package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TestScript_Action2}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Action2.builder()}.
 */
@Generated(from = "TestScript_Action2", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Action2 implements TestScript_Action2 {
  private final TestScript_Operation operation;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;

  private ImmutableTestScript_Action2(
      TestScript_Operation operation,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id) {
    this.operation = operation;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
  }

  /**
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public TestScript_Operation operation() {
    return operation;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * Copy the current immutable object by setting a value for the {@link TestScript_Action2#operation() operation} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestScript_Action2 withOperation(TestScript_Operation value) {
    if (this.operation == value) return this;
    TestScript_Operation newValue = Objects.requireNonNull(value, "operation");
    return new ImmutableTestScript_Action2(newValue, this.extension, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Action2#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action2 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Action2(this.operation, newValue, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Action2#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Action2 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Action2(this.operation, value, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Action2#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action2 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Action2(this.operation, this.extension, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Action2#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Action2 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Action2(this.operation, this.extension, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Action2#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action2 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Action2(this.operation, this.extension, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Action2#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Action2 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Action2(this.operation, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Action2} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Action2
        && equalTo((ImmutableTestScript_Action2) another);
  }

  private boolean equalTo(ImmutableTestScript_Action2 another) {
    return operation.equals(another.operation)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code operation}, {@code extension}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + operation.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Action2} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Action2{");
    builder.append("operation=").append(operation);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
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
  @Generated(from = "TestScript_Action2", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Action2 {
    @Nullable TestScript_Operation operation;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("operation")
    public void setOperation(TestScript_Operation operation) {
      this.operation = operation;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public TestScript_Operation operation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Action2 fromJson(Json json) {
    ImmutableTestScript_Action2.Builder builder = ((ImmutableTestScript_Action2.Builder) ImmutableTestScript_Action2.builder());
    if (json.operation != null) {
      builder.operation(json.operation);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableTestScript_Action2) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Action2} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Action2 instance
   */
  public static TestScript_Action2 copyOf(TestScript_Action2 instance) {
    if (instance instanceof ImmutableTestScript_Action2) {
      return (ImmutableTestScript_Action2) instance;
    }
    return ((ImmutableTestScript_Action2.Builder) ImmutableTestScript_Action2.builder())
        .operation(instance.operation())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Action2 TestScript_Action2}.
   * <pre>
   * ImmutableTestScript_Action2.builder()
   *    .operation(com.fhir.types.fhir.TestScript_Operation) // required {@link TestScript_Action2#operation() operation}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Action2#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Action2#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link TestScript_Action2#id() id}
   *    .build();
   * </pre>
   * @return A new TestScript_Action2 builder
   */
  public static OperationBuildStage builder() {
    return new ImmutableTestScript_Action2.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Action2 TestScript_Action2}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestScript_Action2", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements OperationBuildStage, BuildFinal {
    private static final long INIT_BIT_OPERATION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable TestScript_Operation operation;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link TestScript_Action2#operation() operation} attribute.
     * @param operation The value for operation 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(TestScript_Operation operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = Objects.requireNonNull(operation, "operation");
      initBits &= ~INIT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Action2#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Action2#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Action2#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Action2#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Action2#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Action2#id() id} to id.
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
     * Builds a new {@link TestScript_Action2 TestScript_Action2}.
     * @return An immutable instance of TestScript_Action2
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_Action2 build() {
      checkRequiredAttributes();
      return new ImmutableTestScript_Action2(operation, extension, modifierExtension, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean operationIsSet() {
      return (initBits & INIT_BIT_OPERATION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Action2 is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!operationIsSet()) attributes.add("operation");
      return "Cannot build TestScript_Action2, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "TestScript_Action2", generator = "Immutables")
  public interface OperationBuildStage {
    /**
     * Initializes the value for the {@link TestScript_Action2#operation() operation} attribute.
     * @param operation The value for operation 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal operation(TestScript_Operation operation);
  }

  @Generated(from = "TestScript_Action2", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TestScript_Action2#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link TestScript_Action2#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link TestScript_Action2#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript_Action2#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript_Action2#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link TestScript_Action2#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link TestScript_Action2 TestScript_Action2}.
     * @return An immutable instance of TestScript_Action2
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TestScript_Action2 build();
  }
}
