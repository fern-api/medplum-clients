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
 * Immutable implementation of {@link TestReport_Action2}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestReport_Action2.builder()}.
 */
@Generated(from = "TestReport_Action2", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestReport_Action2 implements TestReport_Action2 {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final TestReport_Operation operation;

  private ImmutableTestReport_Action2(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      TestReport_Operation operation) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.operation = operation;
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
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public TestReport_Operation operation() {
    return operation;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Action2#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action2 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestReport_Action2(newValue, this.modifierExtension, this.extension, this.operation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Action2#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action2 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestReport_Action2(value, this.modifierExtension, this.extension, this.operation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Action2#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action2 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestReport_Action2(this.id, newValue, this.extension, this.operation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Action2#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Action2 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestReport_Action2(this.id, value, this.extension, this.operation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Action2#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Action2 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestReport_Action2(this.id, this.modifierExtension, newValue, this.operation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Action2#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Action2 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestReport_Action2(this.id, this.modifierExtension, value, this.operation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestReport_Action2#operation() operation} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for operation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestReport_Action2 withOperation(TestReport_Operation value) {
    if (this.operation == value) return this;
    TestReport_Operation newValue = Objects.requireNonNull(value, "operation");
    return new ImmutableTestReport_Action2(this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestReport_Action2} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestReport_Action2
        && equalTo((ImmutableTestReport_Action2) another);
  }

  private boolean equalTo(ImmutableTestReport_Action2 another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && operation.equals(another.operation);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code extension}, {@code operation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + operation.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TestReport_Action2} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestReport_Action2{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("operation=").append(operation);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestReport_Action2", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestReport_Action2 {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable TestReport_Operation operation;
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
    @JsonProperty("operation")
    public void setOperation(TestReport_Operation operation) {
      this.operation = operation;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public TestReport_Operation operation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestReport_Action2 fromJson(Json json) {
    ImmutableTestReport_Action2.Builder builder = ((ImmutableTestReport_Action2.Builder) ImmutableTestReport_Action2.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.operation != null) {
      builder.operation(json.operation);
    }
    return (ImmutableTestReport_Action2) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestReport_Action2} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestReport_Action2 instance
   */
  public static TestReport_Action2 copyOf(TestReport_Action2 instance) {
    if (instance instanceof ImmutableTestReport_Action2) {
      return (ImmutableTestReport_Action2) instance;
    }
    return ((ImmutableTestReport_Action2.Builder) ImmutableTestReport_Action2.builder())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .operation(instance.operation())
        .build();
  }

  /**
   * Creates a builder for {@link TestReport_Action2 TestReport_Action2}.
   * <pre>
   * ImmutableTestReport_Action2.builder()
   *    .id(String) // optional {@link TestReport_Action2#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestReport_Action2#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestReport_Action2#extension() extension}
   *    .operation(com.fhir.types.fhir.TestReport_Operation) // required {@link TestReport_Action2#operation() operation}
   *    .build();
   * </pre>
   * @return A new TestReport_Action2 builder
   */
  public static OperationBuildStage builder() {
    return new ImmutableTestReport_Action2.Builder();
  }

  /**
   * Builds instances of type {@link TestReport_Action2 TestReport_Action2}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestReport_Action2", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements OperationBuildStage, BuildFinal {
    private static final long INIT_BIT_OPERATION = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable TestReport_Operation operation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestReport_Action2#id() id} to id.
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
     * Initializes the optional value {@link TestReport_Action2#id() id} to id.
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
     * Initializes the optional value {@link TestReport_Action2#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestReport_Action2#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestReport_Action2#extension() extension} to extension.
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
     * Initializes the optional value {@link TestReport_Action2#extension() extension} to extension.
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
     * Initializes the value for the {@link TestReport_Action2#operation() operation} attribute.
     * @param operation The value for operation 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(TestReport_Operation operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = Objects.requireNonNull(operation, "operation");
      initBits &= ~INIT_BIT_OPERATION;
      return this;
    }

    /**
     * Builds a new {@link TestReport_Action2 TestReport_Action2}.
     * @return An immutable instance of TestReport_Action2
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestReport_Action2 build() {
      checkRequiredAttributes();
      return new ImmutableTestReport_Action2(id, modifierExtension, extension, operation);
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

    private boolean operationIsSet() {
      return (initBits & INIT_BIT_OPERATION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestReport_Action2 is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!operationIsSet()) attributes.add("operation");
      return "Cannot build TestReport_Action2, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "TestReport_Action2", generator = "Immutables")
  public interface OperationBuildStage {
    /**
     * Initializes the value for the {@link TestReport_Action2#operation() operation} attribute.
     * @param operation The value for operation 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal operation(TestReport_Operation operation);
  }

  @Generated(from = "TestReport_Action2", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TestReport_Action2#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link TestReport_Action2#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link TestReport_Action2#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TestReport_Action2#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link TestReport_Action2#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link TestReport_Action2#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link TestReport_Action2 TestReport_Action2}.
     * @return An immutable instance of TestReport_Action2
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TestReport_Action2 build();
  }
}
