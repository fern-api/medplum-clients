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
 * Immutable implementation of {@link MedicationKnowledge_MaxDispense}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_MaxDispense.builder()}.
 */
@Generated(from = "MedicationKnowledge_MaxDispense", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_MaxDispense
    implements MedicationKnowledge_MaxDispense {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Duration period;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final Quantity quantity;

  private ImmutableMedicationKnowledge_MaxDispense(
      @Nullable List<Extension> modifierExtension,
      @Nullable Duration period,
      @Nullable String id,
      @Nullable List<Extension> extension,
      Quantity quantity) {
    this.modifierExtension = modifierExtension;
    this.period = period;
    this.id = id;
    this.extension = extension;
    this.quantity = quantity;
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Duration> period() {
    return Optional.ofNullable(period);
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
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Quantity quantity() {
    return quantity;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_MaxDispense#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_MaxDispense withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_MaxDispense(newValue, this.period, this.id, this.extension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_MaxDispense#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_MaxDispense withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_MaxDispense(value, this.period, this.id, this.extension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_MaxDispense#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_MaxDispense withPeriod(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableMedicationKnowledge_MaxDispense(this.modifierExtension, newValue, this.id, this.extension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_MaxDispense#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_MaxDispense withPeriod(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableMedicationKnowledge_MaxDispense(this.modifierExtension, value, this.id, this.extension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_MaxDispense#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_MaxDispense withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_MaxDispense(this.modifierExtension, this.period, newValue, this.extension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_MaxDispense#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_MaxDispense withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_MaxDispense(this.modifierExtension, this.period, value, this.extension, this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_MaxDispense#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_MaxDispense withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_MaxDispense(this.modifierExtension, this.period, this.id, newValue, this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_MaxDispense#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_MaxDispense withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_MaxDispense(this.modifierExtension, this.period, this.id, value, this.quantity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationKnowledge_MaxDispense#quantity() quantity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quantity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationKnowledge_MaxDispense withQuantity(Quantity value) {
    if (this.quantity == value) return this;
    Quantity newValue = Objects.requireNonNull(value, "quantity");
    return new ImmutableMedicationKnowledge_MaxDispense(this.modifierExtension, this.period, this.id, this.extension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_MaxDispense} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_MaxDispense
        && equalTo((ImmutableMedicationKnowledge_MaxDispense) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_MaxDispense another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(period, another.period)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && quantity.equals(another.quantity);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code period}, {@code id}, {@code extension}, {@code quantity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + quantity.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_MaxDispense} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_MaxDispense{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (period != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 32) builder.append(", ");
    builder.append("quantity=").append(quantity);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_MaxDispense", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_MaxDispense {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Duration> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Quantity quantity;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Duration> period) {
      this.period = period;
      this.periodIsSet = true;
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
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
      this.quantity = quantity;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Quantity quantity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_MaxDispense fromJson(Json json) {
    ImmutableMedicationKnowledge_MaxDispense.Builder builder = ((ImmutableMedicationKnowledge_MaxDispense.Builder) ImmutableMedicationKnowledge_MaxDispense.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.quantity != null) {
      builder.quantity(json.quantity);
    }
    return (ImmutableMedicationKnowledge_MaxDispense) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_MaxDispense} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_MaxDispense instance
   */
  public static MedicationKnowledge_MaxDispense copyOf(MedicationKnowledge_MaxDispense instance) {
    if (instance instanceof ImmutableMedicationKnowledge_MaxDispense) {
      return (ImmutableMedicationKnowledge_MaxDispense) instance;
    }
    return ((ImmutableMedicationKnowledge_MaxDispense.Builder) ImmutableMedicationKnowledge_MaxDispense.builder())
        .modifierExtension(instance.modifierExtension())
        .period(instance.period())
        .id(instance.id())
        .extension(instance.extension())
        .quantity(instance.quantity())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_MaxDispense MedicationKnowledge_MaxDispense}.
   * <pre>
   * ImmutableMedicationKnowledge_MaxDispense.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_MaxDispense#modifierExtension() modifierExtension}
   *    .period(com.fhir.types.fhir.Duration) // optional {@link MedicationKnowledge_MaxDispense#period() period}
   *    .id(String) // optional {@link MedicationKnowledge_MaxDispense#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_MaxDispense#extension() extension}
   *    .quantity(com.fhir.types.fhir.Quantity) // required {@link MedicationKnowledge_MaxDispense#quantity() quantity}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_MaxDispense builder
   */
  public static QuantityBuildStage builder() {
    return new ImmutableMedicationKnowledge_MaxDispense.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_MaxDispense MedicationKnowledge_MaxDispense}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_MaxDispense", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements QuantityBuildStage, BuildFinal {
    private static final long INIT_BIT_QUANTITY = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_PERIOD = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Duration period;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Quantity quantity;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Duration period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Duration> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#extension() extension} to extension.
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
     * Initializes the value for the {@link MedicationKnowledge_MaxDispense#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      initBits &= ~INIT_BIT_QUANTITY;
      return this;
    }

    /**
     * Builds a new {@link MedicationKnowledge_MaxDispense MedicationKnowledge_MaxDispense}.
     * @return An immutable instance of MedicationKnowledge_MaxDispense
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_MaxDispense build() {
      checkRequiredAttributes();
      return new ImmutableMedicationKnowledge_MaxDispense(modifierExtension, period, id, extension, quantity);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean quantityIsSet() {
      return (initBits & INIT_BIT_QUANTITY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_MaxDispense is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!quantityIsSet()) attributes.add("quantity");
      return "Cannot build MedicationKnowledge_MaxDispense, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationKnowledge_MaxDispense", generator = "Immutables")
  public interface QuantityBuildStage {
    /**
     * Initializes the value for the {@link MedicationKnowledge_MaxDispense#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Quantity quantity);
  }

  @Generated(from = "MedicationKnowledge_MaxDispense", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Duration period);

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Duration> period);

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_MaxDispense#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link MedicationKnowledge_MaxDispense MedicationKnowledge_MaxDispense}.
     * @return An immutable instance of MedicationKnowledge_MaxDispense
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationKnowledge_MaxDispense build();
  }
}
