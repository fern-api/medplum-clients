package com.medplum.types.fhir;

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
 * Immutable implementation of {@link SubstancePolymer_StartingMaterial}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstancePolymer_StartingMaterial.builder()}.
 */
@Generated(from = "SubstancePolymer_StartingMaterial", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstancePolymer_StartingMaterial
    implements SubstancePolymer_StartingMaterial {
  private final @Nullable CodeableConcept material;
  private final @Nullable CodeableConcept type;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean isDefining;
  private final @Nullable List<Extension> extension;
  private final @Nullable SubstanceAmount amount;

  private ImmutableSubstancePolymer_StartingMaterial(
      @Nullable CodeableConcept material,
      @Nullable CodeableConcept type,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean isDefining,
      @Nullable List<Extension> extension,
      @Nullable SubstanceAmount amount) {
    this.material = material;
    this.type = type;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.isDefining = isDefining;
    this.extension = extension;
    this.amount = amount;
  }

  /**
   * @return The value of the {@code material} attribute
   */
  @JsonProperty("material")
  @Override
  public Optional<CodeableConcept> material() {
    return Optional.ofNullable(material);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code isDefining} attribute
   */
  @JsonProperty("isDefining")
  @Override
  public Optional<Boolean> isDefining() {
    return Optional.ofNullable(isDefining);
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
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Optional<SubstanceAmount> amount() {
    return Optional.ofNullable(amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_StartingMaterial#material() material} attribute.
   * @param value The value for material
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_StartingMaterial withMaterial(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "material");
    if (this.material == newValue) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(
        newValue,
        this.type,
        this.id,
        this.modifierExtension,
        this.isDefining,
        this.extension,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_StartingMaterial#material() material} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for material
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_StartingMaterial withMaterial(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.material == value) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(value, this.type, this.id, this.modifierExtension, this.isDefining, this.extension, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_StartingMaterial#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_StartingMaterial withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(
        this.material,
        newValue,
        this.id,
        this.modifierExtension,
        this.isDefining,
        this.extension,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_StartingMaterial#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_StartingMaterial withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(
        this.material,
        value,
        this.id,
        this.modifierExtension,
        this.isDefining,
        this.extension,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_StartingMaterial#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_StartingMaterial withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(
        this.material,
        this.type,
        newValue,
        this.modifierExtension,
        this.isDefining,
        this.extension,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_StartingMaterial#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_StartingMaterial withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(
        this.material,
        this.type,
        value,
        this.modifierExtension,
        this.isDefining,
        this.extension,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_StartingMaterial#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_StartingMaterial withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(this.material, this.type, this.id, newValue, this.isDefining, this.extension, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_StartingMaterial#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_StartingMaterial withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(this.material, this.type, this.id, value, this.isDefining, this.extension, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_StartingMaterial#isDefining() isDefining} attribute.
   * @param value The value for isDefining
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_StartingMaterial withIsDefining(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.isDefining, newValue)) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(
        this.material,
        this.type,
        this.id,
        this.modifierExtension,
        newValue,
        this.extension,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_StartingMaterial#isDefining() isDefining} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isDefining
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_StartingMaterial withIsDefining(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.isDefining, value)) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(this.material, this.type, this.id, this.modifierExtension, value, this.extension, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_StartingMaterial#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_StartingMaterial withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(
        this.material,
        this.type,
        this.id,
        this.modifierExtension,
        this.isDefining,
        newValue,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_StartingMaterial#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_StartingMaterial withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(this.material, this.type, this.id, this.modifierExtension, this.isDefining, value, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_StartingMaterial#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_StartingMaterial withAmount(SubstanceAmount value) {
    @Nullable SubstanceAmount newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(
        this.material,
        this.type,
        this.id,
        this.modifierExtension,
        this.isDefining,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_StartingMaterial#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_StartingMaterial withAmount(Optional<? extends SubstanceAmount> optional) {
    @Nullable SubstanceAmount value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableSubstancePolymer_StartingMaterial(
        this.material,
        this.type,
        this.id,
        this.modifierExtension,
        this.isDefining,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstancePolymer_StartingMaterial} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstancePolymer_StartingMaterial
        && equalTo((ImmutableSubstancePolymer_StartingMaterial) another);
  }

  private boolean equalTo(ImmutableSubstancePolymer_StartingMaterial another) {
    return Objects.equals(material, another.material)
        && Objects.equals(type, another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(isDefining, another.isDefining)
        && Objects.equals(extension, another.extension)
        && Objects.equals(amount, another.amount);
  }

  /**
   * Computes a hash code from attributes: {@code material}, {@code type}, {@code id}, {@code modifierExtension}, {@code isDefining}, {@code extension}, {@code amount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(material);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(isDefining);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(amount);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstancePolymer_StartingMaterial} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstancePolymer_StartingMaterial{");
    if (material != null) {
      builder.append("material=").append(material);
    }
    if (type != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (isDefining != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("isDefining=").append(isDefining);
    }
    if (extension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (amount != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("amount=").append(amount);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstancePolymer_StartingMaterial", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstancePolymer_StartingMaterial {
    @Nullable Optional<CodeableConcept> material = Optional.empty();
    boolean materialIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> isDefining = Optional.empty();
    boolean isDefiningIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<SubstanceAmount> amount = Optional.empty();
    boolean amountIsSet;
    @JsonProperty("material")
    public void setMaterial(Optional<CodeableConcept> material) {
      this.material = material;
      this.materialIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
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
    @JsonProperty("isDefining")
    public void setIsDefining(Optional<Boolean> isDefining) {
      this.isDefining = isDefining;
      this.isDefiningIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("amount")
    public void setAmount(Optional<SubstanceAmount> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> material() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> isDefining() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceAmount> amount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstancePolymer_StartingMaterial fromJson(Json json) {
    ImmutableSubstancePolymer_StartingMaterial.Builder builder = ImmutableSubstancePolymer_StartingMaterial.builder();
    if (json.materialIsSet) {
      builder.material(json.material);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.isDefiningIsSet) {
      builder.isDefining(json.isDefining);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    return (ImmutableSubstancePolymer_StartingMaterial) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstancePolymer_StartingMaterial} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstancePolymer_StartingMaterial instance
   */
  public static SubstancePolymer_StartingMaterial copyOf(SubstancePolymer_StartingMaterial instance) {
    if (instance instanceof ImmutableSubstancePolymer_StartingMaterial) {
      return (ImmutableSubstancePolymer_StartingMaterial) instance;
    }
    return ImmutableSubstancePolymer_StartingMaterial.builder()
        .material(instance.material())
        .type(instance.type())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .isDefining(instance.isDefining())
        .extension(instance.extension())
        .amount(instance.amount())
        .build();
  }

  /**
   * Creates a builder for {@link SubstancePolymer_StartingMaterial SubstancePolymer_StartingMaterial}.
   * <pre>
   * ImmutableSubstancePolymer_StartingMaterial.builder()
   *    .material(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstancePolymer_StartingMaterial#material() material}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstancePolymer_StartingMaterial#type() type}
   *    .id(String) // optional {@link SubstancePolymer_StartingMaterial#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_StartingMaterial#modifierExtension() modifierExtension}
   *    .isDefining(Boolean) // optional {@link SubstancePolymer_StartingMaterial#isDefining() isDefining}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_StartingMaterial#extension() extension}
   *    .amount(com.medplum.types.fhir.SubstanceAmount) // optional {@link SubstancePolymer_StartingMaterial#amount() amount}
   *    .build();
   * </pre>
   * @return A new SubstancePolymer_StartingMaterial builder
   */
  public static ImmutableSubstancePolymer_StartingMaterial.Builder builder() {
    return new ImmutableSubstancePolymer_StartingMaterial.Builder();
  }

  /**
   * Builds instances of type {@link SubstancePolymer_StartingMaterial SubstancePolymer_StartingMaterial}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstancePolymer_StartingMaterial", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MATERIAL = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_IS_DEFINING = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_AMOUNT = 0x40L;
    private long optBits;

    private @Nullable CodeableConcept material;
    private @Nullable CodeableConcept type;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean isDefining;
    private @Nullable List<Extension> extension;
    private @Nullable SubstanceAmount amount;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for chained invocation
     */
    public final Builder material(CodeableConcept material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = Objects.requireNonNull(material, "material");
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("material")
    public final Builder material(Optional<? extends CodeableConcept> material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = material.orElse(null);
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#isDefining() isDefining} to isDefining.
     * @param isDefining The value for isDefining
     * @return {@code this} builder for chained invocation
     */
    public final Builder isDefining(boolean isDefining) {
      checkNotIsSet(isDefiningIsSet(), "isDefining");
      this.isDefining = isDefining;
      optBits |= OPT_BIT_IS_DEFINING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#isDefining() isDefining} to isDefining.
     * @param isDefining The value for isDefining
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isDefining")
    public final Builder isDefining(Optional<Boolean> isDefining) {
      checkNotIsSet(isDefiningIsSet(), "isDefining");
      this.isDefining = isDefining.orElse(null);
      optBits |= OPT_BIT_IS_DEFINING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(SubstanceAmount amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_StartingMaterial#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Optional<? extends SubstanceAmount> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Builds a new {@link SubstancePolymer_StartingMaterial SubstancePolymer_StartingMaterial}.
     * @return An immutable instance of SubstancePolymer_StartingMaterial
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstancePolymer_StartingMaterial build() {
      return new ImmutableSubstancePolymer_StartingMaterial(material, type, id, modifierExtension, isDefining, extension, amount);
    }

    private boolean materialIsSet() {
      return (optBits & OPT_BIT_MATERIAL) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean isDefiningIsSet() {
      return (optBits & OPT_BIT_IS_DEFINING) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstancePolymer_StartingMaterial is strict, attribute is already set: ".concat(name));
    }
  }
}