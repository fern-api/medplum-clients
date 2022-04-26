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
 * Immutable implementation of {@link MeasureReport_Component}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasureReport_Component.builder()}.
 */
@Generated(from = "MeasureReport_Component", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasureReport_Component implements MeasureReport_Component {
  private final CodeableConcept code;
  private final @Nullable String id;
  private final CodeableConcept value;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMeasureReport_Component(
      CodeableConcept code,
      @Nullable String id,
      CodeableConcept value,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.code = code;
    this.id = id;
    this.value = value;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public CodeableConcept value() {
    return value;
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
   * Copy the current immutable object by setting a value for the {@link MeasureReport_Component#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasureReport_Component withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableMeasureReport_Component(newValue, this.id, this.value, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Component#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Component withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeasureReport_Component(this.code, newValue, this.value, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Component#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Component withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeasureReport_Component(this.code, value, this.value, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasureReport_Component#value() value} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasureReport_Component withValue(CodeableConcept value) {
    if (this.value == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "value");
    return new ImmutableMeasureReport_Component(this.code, this.id, newValue, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Component#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Component withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasureReport_Component(this.code, this.id, this.value, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Component#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Component withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasureReport_Component(this.code, this.id, this.value, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Component#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Component withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasureReport_Component(this.code, this.id, this.value, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Component#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Component withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasureReport_Component(this.code, this.id, this.value, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasureReport_Component} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasureReport_Component
        && equalTo((ImmutableMeasureReport_Component) another);
  }

  private boolean equalTo(ImmutableMeasureReport_Component another) {
    return code.equals(another.code)
        && Objects.equals(id, another.id)
        && value.equals(another.value)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code id}, {@code value}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + value.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MeasureReport_Component} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MeasureReport_Component{");
    builder.append("code=").append(code);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("value=").append(value);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MeasureReport_Component", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MeasureReport_Component {
    @Nullable CodeableConcept code;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable CodeableConcept value;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(CodeableConcept value) {
      this.value = value;
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
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableMeasureReport_Component fromJson(Json json) {
    ImmutableMeasureReport_Component.Builder builder = ((ImmutableMeasureReport_Component.Builder) ImmutableMeasureReport_Component.builder());
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMeasureReport_Component) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MeasureReport_Component} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasureReport_Component instance
   */
  public static MeasureReport_Component copyOf(MeasureReport_Component instance) {
    if (instance instanceof ImmutableMeasureReport_Component) {
      return (ImmutableMeasureReport_Component) instance;
    }
    return ((ImmutableMeasureReport_Component.Builder) ImmutableMeasureReport_Component.builder())
        .code(instance.code())
        .id(instance.id())
        .value(instance.value())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MeasureReport_Component MeasureReport_Component}.
   * <pre>
   * ImmutableMeasureReport_Component.builder()
   *    .code(com.fhir.types.fhir.CodeableConcept) // required {@link MeasureReport_Component#code() code}
   *    .id(String) // optional {@link MeasureReport_Component#id() id}
   *    .value(com.fhir.types.fhir.CodeableConcept) // required {@link MeasureReport_Component#value() value}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Component#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Component#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MeasureReport_Component builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableMeasureReport_Component.Builder();
  }

  /**
   * Builds instances of type {@link MeasureReport_Component MeasureReport_Component}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MeasureReport_Component", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, ValueBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable CodeableConcept code;
    private @Nullable String id;
    private @Nullable CodeableConcept value;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link MeasureReport_Component#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Component#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport_Component#id() id} to id.
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
     * Initializes the value for the {@link MeasureReport_Component#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(CodeableConcept value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Component#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport_Component#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport_Component#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport_Component#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MeasureReport_Component MeasureReport_Component}.
     * @return An immutable instance of MeasureReport_Component
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MeasureReport_Component build() {
      checkRequiredAttributes();
      return new ImmutableMeasureReport_Component(code, id, value, extension, modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MeasureReport_Component is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build MeasureReport_Component, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MeasureReport_Component", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link MeasureReport_Component#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    ValueBuildStage code(CodeableConcept code);
  }

  @Generated(from = "MeasureReport_Component", generator = "Immutables")
  public interface ValueBuildStage {
    /**
     * Initializes the value for the {@link MeasureReport_Component#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(CodeableConcept value);
  }

  @Generated(from = "MeasureReport_Component", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MeasureReport_Component#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MeasureReport_Component#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MeasureReport_Component#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MeasureReport_Component#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MeasureReport_Component#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MeasureReport_Component#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link MeasureReport_Component MeasureReport_Component}.
     * @return An immutable instance of MeasureReport_Component
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MeasureReport_Component build();
  }
}
