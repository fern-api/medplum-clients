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
 * Immutable implementation of {@link DeviceDefinition_Material}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceDefinition_Material.builder()}.
 */
@Generated(from = "DeviceDefinition_Material", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceDefinition_Material implements DeviceDefinition_Material {
  private final CodeableConcept substance;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean alternate;
  private final @Nullable Boolean allergenicIndicator;

  private ImmutableDeviceDefinition_Material(
      CodeableConcept substance,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean alternate,
      @Nullable Boolean allergenicIndicator) {
    this.substance = substance;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.alternate = alternate;
    this.allergenicIndicator = allergenicIndicator;
  }

  /**
   * @return The value of the {@code substance} attribute
   */
  @JsonProperty("substance")
  @Override
  public CodeableConcept substance() {
    return substance;
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
   * @return The value of the {@code alternate} attribute
   */
  @JsonProperty("alternate")
  @Override
  public Optional<Boolean> alternate() {
    return Optional.ofNullable(alternate);
  }

  /**
   * @return The value of the {@code allergenicIndicator} attribute
   */
  @JsonProperty("allergenicIndicator")
  @Override
  public Optional<Boolean> allergenicIndicator() {
    return Optional.ofNullable(allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceDefinition_Material#substance() substance} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for substance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceDefinition_Material withSubstance(CodeableConcept value) {
    if (this.substance == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "substance");
    return new ImmutableDeviceDefinition_Material(
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.alternate,
        this.allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Material#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Material withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDeviceDefinition_Material(
        this.substance,
        newValue,
        this.extension,
        this.modifierExtension,
        this.alternate,
        this.allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Material#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Material withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDeviceDefinition_Material(
        this.substance,
        value,
        this.extension,
        this.modifierExtension,
        this.alternate,
        this.allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Material#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Material withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceDefinition_Material(
        this.substance,
        this.id,
        newValue,
        this.modifierExtension,
        this.alternate,
        this.allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Material#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_Material withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceDefinition_Material(
        this.substance,
        this.id,
        value,
        this.modifierExtension,
        this.alternate,
        this.allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Material#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Material withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceDefinition_Material(this.substance, this.id, this.extension, newValue, this.alternate, this.allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Material#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_Material withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceDefinition_Material(this.substance, this.id, this.extension, value, this.alternate, this.allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Material#alternate() alternate} attribute.
   * @param value The value for alternate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Material withAlternate(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.alternate, newValue)) return this;
    return new ImmutableDeviceDefinition_Material(
        this.substance,
        this.id,
        this.extension,
        this.modifierExtension,
        newValue,
        this.allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Material#alternate() alternate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alternate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Material withAlternate(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.alternate, value)) return this;
    return new ImmutableDeviceDefinition_Material(
        this.substance,
        this.id,
        this.extension,
        this.modifierExtension,
        value,
        this.allergenicIndicator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Material#allergenicIndicator() allergenicIndicator} attribute.
   * @param value The value for allergenicIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Material withAllergenicIndicator(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.allergenicIndicator, newValue)) return this;
    return new ImmutableDeviceDefinition_Material(this.substance, this.id, this.extension, this.modifierExtension, this.alternate, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Material#allergenicIndicator() allergenicIndicator} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allergenicIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Material withAllergenicIndicator(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.allergenicIndicator, value)) return this;
    return new ImmutableDeviceDefinition_Material(this.substance, this.id, this.extension, this.modifierExtension, this.alternate, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceDefinition_Material} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceDefinition_Material
        && equalTo((ImmutableDeviceDefinition_Material) another);
  }

  private boolean equalTo(ImmutableDeviceDefinition_Material another) {
    return substance.equals(another.substance)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(alternate, another.alternate)
        && Objects.equals(allergenicIndicator, another.allergenicIndicator);
  }

  /**
   * Computes a hash code from attributes: {@code substance}, {@code id}, {@code extension}, {@code modifierExtension}, {@code alternate}, {@code allergenicIndicator}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + substance.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(alternate);
    h += (h << 5) + Objects.hashCode(allergenicIndicator);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceDefinition_Material} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceDefinition_Material{");
    builder.append("substance=").append(substance);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (alternate != null) {
      builder.append(", ");
      builder.append("alternate=").append(alternate);
    }
    if (allergenicIndicator != null) {
      builder.append(", ");
      builder.append("allergenicIndicator=").append(allergenicIndicator);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceDefinition_Material", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceDefinition_Material {
    @Nullable CodeableConcept substance;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> alternate = Optional.empty();
    boolean alternateIsSet;
    @Nullable Optional<Boolean> allergenicIndicator = Optional.empty();
    boolean allergenicIndicatorIsSet;
    @JsonProperty("substance")
    public void setSubstance(CodeableConcept substance) {
      this.substance = substance;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("alternate")
    public void setAlternate(Optional<Boolean> alternate) {
      this.alternate = alternate;
      this.alternateIsSet = true;
    }
    @JsonProperty("allergenicIndicator")
    public void setAllergenicIndicator(Optional<Boolean> allergenicIndicator) {
      this.allergenicIndicator = allergenicIndicator;
      this.allergenicIndicatorIsSet = true;
    }
    @Override
    public CodeableConcept substance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> alternate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> allergenicIndicator() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceDefinition_Material fromJson(Json json) {
    ImmutableDeviceDefinition_Material.Builder builder = ((ImmutableDeviceDefinition_Material.Builder) ImmutableDeviceDefinition_Material.builder());
    if (json.substance != null) {
      builder.substance(json.substance);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.alternateIsSet) {
      builder.alternate(json.alternate);
    }
    if (json.allergenicIndicatorIsSet) {
      builder.allergenicIndicator(json.allergenicIndicator);
    }
    return (ImmutableDeviceDefinition_Material) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceDefinition_Material} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceDefinition_Material instance
   */
  public static DeviceDefinition_Material copyOf(DeviceDefinition_Material instance) {
    if (instance instanceof ImmutableDeviceDefinition_Material) {
      return (ImmutableDeviceDefinition_Material) instance;
    }
    return ((ImmutableDeviceDefinition_Material.Builder) ImmutableDeviceDefinition_Material.builder())
        .substance(instance.substance())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .alternate(instance.alternate())
        .allergenicIndicator(instance.allergenicIndicator())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceDefinition_Material DeviceDefinition_Material}.
   * <pre>
   * ImmutableDeviceDefinition_Material.builder()
   *    .substance(com.fhir.types.fhir.CodeableConcept) // required {@link DeviceDefinition_Material#substance() substance}
   *    .id(String) // optional {@link DeviceDefinition_Material#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_Material#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_Material#modifierExtension() modifierExtension}
   *    .alternate(Boolean) // optional {@link DeviceDefinition_Material#alternate() alternate}
   *    .allergenicIndicator(Boolean) // optional {@link DeviceDefinition_Material#allergenicIndicator() allergenicIndicator}
   *    .build();
   * </pre>
   * @return A new DeviceDefinition_Material builder
   */
  public static SubstanceBuildStage builder() {
    return new ImmutableDeviceDefinition_Material.Builder();
  }

  /**
   * Builds instances of type {@link DeviceDefinition_Material DeviceDefinition_Material}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DeviceDefinition_Material", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubstanceBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBSTANCE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ALTERNATE = 0x8L;
    private static final long OPT_BIT_ALLERGENIC_INDICATOR = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept substance;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean alternate;
    private @Nullable Boolean allergenicIndicator;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link DeviceDefinition_Material#substance() substance} attribute.
     * @param substance The value for substance 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substance")
    public final Builder substance(CodeableConcept substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = Objects.requireNonNull(substance, "substance");
      initBits &= ~INIT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition_Material#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition_Material#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition_Material#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition_Material#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_Material#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_Material#alternate() alternate} to alternate.
     * @param alternate The value for alternate
     * @return {@code this} builder for chained invocation
     */
    public final Builder alternate(boolean alternate) {
      checkNotIsSet(alternateIsSet(), "alternate");
      this.alternate = alternate;
      optBits |= OPT_BIT_ALTERNATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#alternate() alternate} to alternate.
     * @param alternate The value for alternate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alternate")
    public final Builder alternate(Optional<Boolean> alternate) {
      checkNotIsSet(alternateIsSet(), "alternate");
      this.alternate = alternate.orElse(null);
      optBits |= OPT_BIT_ALTERNATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#allergenicIndicator() allergenicIndicator} to allergenicIndicator.
     * @param allergenicIndicator The value for allergenicIndicator
     * @return {@code this} builder for chained invocation
     */
    public final Builder allergenicIndicator(boolean allergenicIndicator) {
      checkNotIsSet(allergenicIndicatorIsSet(), "allergenicIndicator");
      this.allergenicIndicator = allergenicIndicator;
      optBits |= OPT_BIT_ALLERGENIC_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#allergenicIndicator() allergenicIndicator} to allergenicIndicator.
     * @param allergenicIndicator The value for allergenicIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allergenicIndicator")
    public final Builder allergenicIndicator(Optional<Boolean> allergenicIndicator) {
      checkNotIsSet(allergenicIndicatorIsSet(), "allergenicIndicator");
      this.allergenicIndicator = allergenicIndicator.orElse(null);
      optBits |= OPT_BIT_ALLERGENIC_INDICATOR;
      return this;
    }

    /**
     * Builds a new {@link DeviceDefinition_Material DeviceDefinition_Material}.
     * @return An immutable instance of DeviceDefinition_Material
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceDefinition_Material build() {
      checkRequiredAttributes();
      return new ImmutableDeviceDefinition_Material(substance, id, extension, modifierExtension, alternate, allergenicIndicator);
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

    private boolean alternateIsSet() {
      return (optBits & OPT_BIT_ALTERNATE) != 0;
    }

    private boolean allergenicIndicatorIsSet() {
      return (optBits & OPT_BIT_ALLERGENIC_INDICATOR) != 0;
    }

    private boolean substanceIsSet() {
      return (initBits & INIT_BIT_SUBSTANCE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceDefinition_Material is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!substanceIsSet()) attributes.add("substance");
      return "Cannot build DeviceDefinition_Material, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DeviceDefinition_Material", generator = "Immutables")
  public interface SubstanceBuildStage {
    /**
     * Initializes the value for the {@link DeviceDefinition_Material#substance() substance} attribute.
     * @param substance The value for substance 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal substance(CodeableConcept substance);
  }

  @Generated(from = "DeviceDefinition_Material", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#alternate() alternate} to alternate.
     * @param alternate The value for alternate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alternate(boolean alternate);

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#alternate() alternate} to alternate.
     * @param alternate The value for alternate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alternate(Optional<Boolean> alternate);

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#allergenicIndicator() allergenicIndicator} to allergenicIndicator.
     * @param allergenicIndicator The value for allergenicIndicator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allergenicIndicator(boolean allergenicIndicator);

    /**
     * Initializes the optional value {@link DeviceDefinition_Material#allergenicIndicator() allergenicIndicator} to allergenicIndicator.
     * @param allergenicIndicator The value for allergenicIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allergenicIndicator(Optional<Boolean> allergenicIndicator);

    /**
     * Builds a new {@link DeviceDefinition_Material DeviceDefinition_Material}.
     * @return An immutable instance of DeviceDefinition_Material
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceDefinition_Material build();
  }
}
