package com.medplum.types.fhir;

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
 * Immutable implementation of {@link ImmunizationRecommendation_DateCriterion}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunizationRecommendation_DateCriterion.builder()}.
 */
@Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunizationRecommendation_DateCriterion
    implements ImmunizationRecommendation_DateCriterion {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DateTime value;
  private final CodeableConcept code;

  private ImmutableImmunizationRecommendation_DateCriterion(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable DateTime value,
      CodeableConcept code) {
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.value = value;
    this.code = code;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<DateTime> value() {
    return Optional.ofNullable(value);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_DateCriterion#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(newValue, this.extension, this.modifierExtension, this.value, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_DateCriterion#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(value, this.extension, this.modifierExtension, this.value, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_DateCriterion#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, newValue, this.modifierExtension, this.value, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_DateCriterion#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_DateCriterion withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, value, this.modifierExtension, this.value, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.extension, newValue, this.value, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_DateCriterion withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.extension, value, this.value, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_DateCriterion#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withValue(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.extension, this.modifierExtension, newValue, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_DateCriterion#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_DateCriterion withValue(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.extension, this.modifierExtension, value, this.code);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationRecommendation_DateCriterion#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.extension, this.modifierExtension, this.value, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunizationRecommendation_DateCriterion} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunizationRecommendation_DateCriterion
        && equalTo((ImmutableImmunizationRecommendation_DateCriterion) another);
  }

  private boolean equalTo(ImmutableImmunizationRecommendation_DateCriterion another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(value, another.value)
        && code.equals(another.code);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code modifierExtension}, {@code value}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + code.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ImmunizationRecommendation_DateCriterion} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImmunizationRecommendation_DateCriterion{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (value != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (builder.length() > 41) builder.append(", ");
    builder.append("code=").append(code);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImmunizationRecommendation_DateCriterion {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DateTime> value = Optional.empty();
    boolean valueIsSet;
    @Nullable CodeableConcept code;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<DateTime> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> value() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImmunizationRecommendation_DateCriterion fromJson(Json json) {
    ImmutableImmunizationRecommendation_DateCriterion.Builder builder = ((ImmutableImmunizationRecommendation_DateCriterion.Builder) ImmutableImmunizationRecommendation_DateCriterion.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    return (ImmutableImmunizationRecommendation_DateCriterion) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImmunizationRecommendation_DateCriterion} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImmunizationRecommendation_DateCriterion instance
   */
  public static ImmunizationRecommendation_DateCriterion copyOf(ImmunizationRecommendation_DateCriterion instance) {
    if (instance instanceof ImmutableImmunizationRecommendation_DateCriterion) {
      return (ImmutableImmunizationRecommendation_DateCriterion) instance;
    }
    return ((ImmutableImmunizationRecommendation_DateCriterion.Builder) ImmutableImmunizationRecommendation_DateCriterion.builder())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .value(instance.value())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link ImmunizationRecommendation_DateCriterion ImmunizationRecommendation_DateCriterion}.
   * <pre>
   * ImmutableImmunizationRecommendation_DateCriterion.builder()
   *    .id(String) // optional {@link ImmunizationRecommendation_DateCriterion#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationRecommendation_DateCriterion#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension}
   *    .value(com.medplum.types.fhir.DateTime) // optional {@link ImmunizationRecommendation_DateCriterion#value() value}
   *    .code(com.medplum.types.fhir.CodeableConcept) // required {@link ImmunizationRecommendation_DateCriterion#code() code}
   *    .build();
   * </pre>
   * @return A new ImmunizationRecommendation_DateCriterion builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableImmunizationRecommendation_DateCriterion.Builder();
  }

  /**
   * Builds instances of type {@link ImmunizationRecommendation_DateCriterion ImmunizationRecommendation_DateCriterion}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable DateTime value;
    private @Nullable CodeableConcept code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#id() id} to id.
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
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#id() id} to id.
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
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#extension() extension} to extension.
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
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#extension() extension} to extension.
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
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(DateTime value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<? extends DateTime> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the value for the {@link ImmunizationRecommendation_DateCriterion#code() code} attribute.
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
     * Builds a new {@link ImmunizationRecommendation_DateCriterion ImmunizationRecommendation_DateCriterion}.
     * @return An immutable instance of ImmunizationRecommendation_DateCriterion
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmunizationRecommendation_DateCriterion build() {
      checkRequiredAttributes();
      return new ImmutableImmunizationRecommendation_DateCriterion(id, extension, modifierExtension, value, code);
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

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImmunizationRecommendation_DateCriterion is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build ImmunizationRecommendation_DateCriterion, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationRecommendation_DateCriterion#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(CodeableConcept code);
  }

  @Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    BuildFinal value(DateTime value);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(Optional<? extends DateTime> value);

    /**
     * Builds a new {@link ImmunizationRecommendation_DateCriterion ImmunizationRecommendation_DateCriterion}.
     * @return An immutable instance of ImmunizationRecommendation_DateCriterion
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImmunizationRecommendation_DateCriterion build();
  }
}
