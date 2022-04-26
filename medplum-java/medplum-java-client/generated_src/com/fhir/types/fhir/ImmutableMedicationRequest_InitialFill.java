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
 * Immutable implementation of {@link MedicationRequest_InitialFill}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationRequest_InitialFill.builder()}.
 */
@Generated(from = "MedicationRequest_InitialFill", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationRequest_InitialFill
    implements MedicationRequest_InitialFill {
  private final @Nullable Duration duration;
  private final @Nullable Quantity quantity;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;

  private ImmutableMedicationRequest_InitialFill(
      @Nullable Duration duration,
      @Nullable Quantity quantity,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id) {
    this.duration = duration;
    this.quantity = quantity;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
  }

  /**
   * @return The value of the {@code duration} attribute
   */
  @JsonProperty("duration")
  @Override
  public Optional<Duration> duration() {
    return Optional.ofNullable(duration);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_InitialFill#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_InitialFill withDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableMedicationRequest_InitialFill(newValue, this.quantity, this.extension, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_InitialFill#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_InitialFill withDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableMedicationRequest_InitialFill(value, this.quantity, this.extension, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_InitialFill#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_InitialFill withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableMedicationRequest_InitialFill(this.duration, newValue, this.extension, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_InitialFill#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_InitialFill withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableMedicationRequest_InitialFill(this.duration, value, this.extension, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_InitialFill#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_InitialFill withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationRequest_InitialFill(this.duration, this.quantity, newValue, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_InitialFill#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_InitialFill withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationRequest_InitialFill(this.duration, this.quantity, value, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_InitialFill#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_InitialFill withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationRequest_InitialFill(this.duration, this.quantity, this.extension, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_InitialFill#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_InitialFill withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationRequest_InitialFill(this.duration, this.quantity, this.extension, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_InitialFill#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_InitialFill withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationRequest_InitialFill(this.duration, this.quantity, this.extension, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_InitialFill#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_InitialFill withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationRequest_InitialFill(this.duration, this.quantity, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationRequest_InitialFill} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationRequest_InitialFill
        && equalTo((ImmutableMedicationRequest_InitialFill) another);
  }

  private boolean equalTo(ImmutableMedicationRequest_InitialFill another) {
    return Objects.equals(duration, another.duration)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code duration}, {@code quantity}, {@code extension}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(duration);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationRequest_InitialFill} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationRequest_InitialFill{");
    if (duration != null) {
      builder.append("duration=").append(duration);
    }
    if (quantity != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationRequest_InitialFill", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationRequest_InitialFill {
    @Nullable Optional<Duration> duration = Optional.empty();
    boolean durationIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("duration")
    public void setDuration(Optional<Duration> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
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
    public Optional<Duration> duration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicationRequest_InitialFill fromJson(Json json) {
    ImmutableMedicationRequest_InitialFill.Builder builder = ImmutableMedicationRequest_InitialFill.builder();
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
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
    return (ImmutableMedicationRequest_InitialFill) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationRequest_InitialFill} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationRequest_InitialFill instance
   */
  public static MedicationRequest_InitialFill copyOf(MedicationRequest_InitialFill instance) {
    if (instance instanceof ImmutableMedicationRequest_InitialFill) {
      return (ImmutableMedicationRequest_InitialFill) instance;
    }
    return ImmutableMedicationRequest_InitialFill.builder()
        .duration(instance.duration())
        .quantity(instance.quantity())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationRequest_InitialFill MedicationRequest_InitialFill}.
   * <pre>
   * ImmutableMedicationRequest_InitialFill.builder()
   *    .duration(com.fhir.types.fhir.Duration) // optional {@link MedicationRequest_InitialFill#duration() duration}
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link MedicationRequest_InitialFill#quantity() quantity}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationRequest_InitialFill#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationRequest_InitialFill#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link MedicationRequest_InitialFill#id() id}
   *    .build();
   * </pre>
   * @return A new MedicationRequest_InitialFill builder
   */
  public static ImmutableMedicationRequest_InitialFill.Builder builder() {
    return new ImmutableMedicationRequest_InitialFill.Builder();
  }

  /**
   * Builds instances of type {@link MedicationRequest_InitialFill MedicationRequest_InitialFill}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationRequest_InitialFill", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DURATION = 0x1L;
    private static final long OPT_BIT_QUANTITY = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long optBits;

    private @Nullable Duration duration;
    private @Nullable Quantity quantity;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationRequest_InitialFill#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(Duration duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_InitialFill#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("duration")
    public final Builder duration(Optional<? extends Duration> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_InitialFill#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link MedicationRequest_InitialFill#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link MedicationRequest_InitialFill#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationRequest_InitialFill#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationRequest_InitialFill#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest_InitialFill#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest_InitialFill#id() id} to id.
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
     * Initializes the optional value {@link MedicationRequest_InitialFill#id() id} to id.
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
     * Builds a new {@link MedicationRequest_InitialFill MedicationRequest_InitialFill}.
     * @return An immutable instance of MedicationRequest_InitialFill
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationRequest_InitialFill build() {
      return new ImmutableMedicationRequest_InitialFill(duration, quantity, extension, modifierExtension, id);
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
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

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationRequest_InitialFill is strict, attribute is already set: ".concat(name));
    }
  }
}
