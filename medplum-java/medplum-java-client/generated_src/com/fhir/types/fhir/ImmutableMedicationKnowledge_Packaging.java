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
 * Immutable implementation of {@link MedicationKnowledge_Packaging}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_Packaging.builder()}.
 */
@Generated(from = "MedicationKnowledge_Packaging", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_Packaging
    implements MedicationKnowledge_Packaging {
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept type;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Quantity quantity;

  private ImmutableMedicationKnowledge_Packaging(
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept type,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Quantity quantity) {
    this.extension = extension;
    this.type = type;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.quantity = quantity;
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
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Packaging#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Packaging withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_Packaging(newValue, this.type, this.id, this.modifierExtension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Packaging#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Packaging withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_Packaging(value, this.type, this.id, this.modifierExtension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Packaging#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Packaging withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicationKnowledge_Packaging(this.extension, newValue, this.id, this.modifierExtension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Packaging#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Packaging withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicationKnowledge_Packaging(this.extension, value, this.id, this.modifierExtension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Packaging#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Packaging withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_Packaging(this.extension, this.type, newValue, this.modifierExtension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Packaging#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Packaging withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_Packaging(this.extension, this.type, value, this.modifierExtension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Packaging#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Packaging withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_Packaging(this.extension, this.type, this.id, newValue, this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Packaging#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Packaging withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_Packaging(this.extension, this.type, this.id, value, this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Packaging#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Packaging withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableMedicationKnowledge_Packaging(this.extension, this.type, this.id, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Packaging#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Packaging withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableMedicationKnowledge_Packaging(this.extension, this.type, this.id, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_Packaging} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_Packaging
        && equalTo((ImmutableMedicationKnowledge_Packaging) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_Packaging another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(type, another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(quantity, another.quantity);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code type}, {@code id}, {@code modifierExtension}, {@code quantity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(quantity);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_Packaging} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_Packaging{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (quantity != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_Packaging", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_Packaging {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_Packaging fromJson(Json json) {
    ImmutableMedicationKnowledge_Packaging.Builder builder = ImmutableMedicationKnowledge_Packaging.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    return (ImmutableMedicationKnowledge_Packaging) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_Packaging} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_Packaging instance
   */
  public static MedicationKnowledge_Packaging copyOf(MedicationKnowledge_Packaging instance) {
    if (instance instanceof ImmutableMedicationKnowledge_Packaging) {
      return (ImmutableMedicationKnowledge_Packaging) instance;
    }
    return ImmutableMedicationKnowledge_Packaging.builder()
        .extension(instance.extension())
        .type(instance.type())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .quantity(instance.quantity())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_Packaging MedicationKnowledge_Packaging}.
   * <pre>
   * ImmutableMedicationKnowledge_Packaging.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Packaging#extension() extension}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationKnowledge_Packaging#type() type}
   *    .id(String) // optional {@link MedicationKnowledge_Packaging#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Packaging#modifierExtension() modifierExtension}
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link MedicationKnowledge_Packaging#quantity() quantity}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_Packaging builder
   */
  public static ImmutableMedicationKnowledge_Packaging.Builder builder() {
    return new ImmutableMedicationKnowledge_Packaging.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_Packaging MedicationKnowledge_Packaging}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_Packaging", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_QUANTITY = 0x10L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept type;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity quantity;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Packaging#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Packaging#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Packaging#type() type} to type.
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
     * Initializes the optional value {@link MedicationKnowledge_Packaging#type() type} to type.
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
     * Initializes the optional value {@link MedicationKnowledge_Packaging#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Packaging#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Packaging#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Packaging#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Packaging#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Packaging#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Builds a new {@link MedicationKnowledge_Packaging MedicationKnowledge_Packaging}.
     * @return An immutable instance of MedicationKnowledge_Packaging
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_Packaging build() {
      return new ImmutableMedicationKnowledge_Packaging(extension, type, id, modifierExtension, quantity);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
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

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_Packaging is strict, attribute is already set: ".concat(name));
    }
  }
}
