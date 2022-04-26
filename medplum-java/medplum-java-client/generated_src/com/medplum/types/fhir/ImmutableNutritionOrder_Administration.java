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
 * Immutable implementation of {@link NutritionOrder_Administration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNutritionOrder_Administration.builder()}.
 */
@Generated(from = "NutritionOrder_Administration", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNutritionOrder_Administration
    implements NutritionOrder_Administration {
  private final @Nullable Quantity rateQuantity;
  private final @Nullable Ratio rateRatio;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Quantity quantity;
  private final @Nullable Timing schedule;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableNutritionOrder_Administration(
      @Nullable Quantity rateQuantity,
      @Nullable Ratio rateRatio,
      @Nullable List<Extension> modifierExtension,
      @Nullable Quantity quantity,
      @Nullable Timing schedule,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.rateQuantity = rateQuantity;
    this.rateRatio = rateRatio;
    this.modifierExtension = modifierExtension;
    this.quantity = quantity;
    this.schedule = schedule;
    this.extension = extension;
    this.id = id;
  }

  /**
   * @return The value of the {@code rateQuantity} attribute
   */
  @JsonProperty("rateQuantity")
  @Override
  public Optional<Quantity> rateQuantity() {
    return Optional.ofNullable(rateQuantity);
  }

  /**
   * @return The value of the {@code rateRatio} attribute
   */
  @JsonProperty("rateRatio")
  @Override
  public Optional<Ratio> rateRatio() {
    return Optional.ofNullable(rateRatio);
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
   * @return The value of the {@code schedule} attribute
   */
  @JsonProperty("schedule")
  @Override
  public Optional<Timing> schedule() {
    return Optional.ofNullable(schedule);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Administration#rateQuantity() rateQuantity} attribute.
   * @param value The value for rateQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Administration withRateQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "rateQuantity");
    if (this.rateQuantity == newValue) return this;
    return new ImmutableNutritionOrder_Administration(
        newValue,
        this.rateRatio,
        this.modifierExtension,
        this.quantity,
        this.schedule,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Administration#rateQuantity() rateQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rateQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Administration withRateQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.rateQuantity == value) return this;
    return new ImmutableNutritionOrder_Administration(
        value,
        this.rateRatio,
        this.modifierExtension,
        this.quantity,
        this.schedule,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Administration#rateRatio() rateRatio} attribute.
   * @param value The value for rateRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Administration withRateRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "rateRatio");
    if (this.rateRatio == newValue) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        newValue,
        this.modifierExtension,
        this.quantity,
        this.schedule,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Administration#rateRatio() rateRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rateRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Administration withRateRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.rateRatio == value) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        value,
        this.modifierExtension,
        this.quantity,
        this.schedule,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Administration#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Administration withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        this.rateRatio,
        newValue,
        this.quantity,
        this.schedule,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Administration#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Administration withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableNutritionOrder_Administration(this.rateQuantity, this.rateRatio, value, this.quantity, this.schedule, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Administration#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Administration withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        this.rateRatio,
        this.modifierExtension,
        newValue,
        this.schedule,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Administration#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Administration withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        this.rateRatio,
        this.modifierExtension,
        value,
        this.schedule,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Administration#schedule() schedule} attribute.
   * @param value The value for schedule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Administration withSchedule(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "schedule");
    if (this.schedule == newValue) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        this.rateRatio,
        this.modifierExtension,
        this.quantity,
        newValue,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Administration#schedule() schedule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for schedule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Administration withSchedule(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.schedule == value) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        this.rateRatio,
        this.modifierExtension,
        this.quantity,
        value,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Administration#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Administration withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        this.rateRatio,
        this.modifierExtension,
        this.quantity,
        this.schedule,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Administration#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Administration withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        this.rateRatio,
        this.modifierExtension,
        this.quantity,
        this.schedule,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Administration#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Administration withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        this.rateRatio,
        this.modifierExtension,
        this.quantity,
        this.schedule,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Administration#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Administration withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableNutritionOrder_Administration(
        this.rateQuantity,
        this.rateRatio,
        this.modifierExtension,
        this.quantity,
        this.schedule,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNutritionOrder_Administration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNutritionOrder_Administration
        && equalTo((ImmutableNutritionOrder_Administration) another);
  }

  private boolean equalTo(ImmutableNutritionOrder_Administration another) {
    return Objects.equals(rateQuantity, another.rateQuantity)
        && Objects.equals(rateRatio, another.rateRatio)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(schedule, another.schedule)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code rateQuantity}, {@code rateRatio}, {@code modifierExtension}, {@code quantity}, {@code schedule}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(rateQuantity);
    h += (h << 5) + Objects.hashCode(rateRatio);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(schedule);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code NutritionOrder_Administration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("NutritionOrder_Administration{");
    if (rateQuantity != null) {
      builder.append("rateQuantity=").append(rateQuantity);
    }
    if (rateRatio != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("rateRatio=").append(rateRatio);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (quantity != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (schedule != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("schedule=").append(schedule);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
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
  @Generated(from = "NutritionOrder_Administration", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NutritionOrder_Administration {
    @Nullable Optional<Quantity> rateQuantity = Optional.empty();
    boolean rateQuantityIsSet;
    @Nullable Optional<Ratio> rateRatio = Optional.empty();
    boolean rateRatioIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<Timing> schedule = Optional.empty();
    boolean scheduleIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("rateQuantity")
    public void setRateQuantity(Optional<Quantity> rateQuantity) {
      this.rateQuantity = rateQuantity;
      this.rateQuantityIsSet = true;
    }
    @JsonProperty("rateRatio")
    public void setRateRatio(Optional<Ratio> rateRatio) {
      this.rateRatio = rateRatio;
      this.rateRatioIsSet = true;
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
    @JsonProperty("schedule")
    public void setSchedule(Optional<Timing> schedule) {
      this.schedule = schedule;
      this.scheduleIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<Quantity> rateQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> rateRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> schedule() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableNutritionOrder_Administration fromJson(Json json) {
    ImmutableNutritionOrder_Administration.Builder builder = ImmutableNutritionOrder_Administration.builder();
    if (json.rateQuantityIsSet) {
      builder.rateQuantity(json.rateQuantity);
    }
    if (json.rateRatioIsSet) {
      builder.rateRatio(json.rateRatio);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.scheduleIsSet) {
      builder.schedule(json.schedule);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableNutritionOrder_Administration) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NutritionOrder_Administration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NutritionOrder_Administration instance
   */
  public static NutritionOrder_Administration copyOf(NutritionOrder_Administration instance) {
    if (instance instanceof ImmutableNutritionOrder_Administration) {
      return (ImmutableNutritionOrder_Administration) instance;
    }
    return ImmutableNutritionOrder_Administration.builder()
        .rateQuantity(instance.rateQuantity())
        .rateRatio(instance.rateRatio())
        .modifierExtension(instance.modifierExtension())
        .quantity(instance.quantity())
        .schedule(instance.schedule())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link NutritionOrder_Administration NutritionOrder_Administration}.
   * <pre>
   * ImmutableNutritionOrder_Administration.builder()
   *    .rateQuantity(com.medplum.types.fhir.Quantity) // optional {@link NutritionOrder_Administration#rateQuantity() rateQuantity}
   *    .rateRatio(com.medplum.types.fhir.Ratio) // optional {@link NutritionOrder_Administration#rateRatio() rateRatio}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_Administration#modifierExtension() modifierExtension}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link NutritionOrder_Administration#quantity() quantity}
   *    .schedule(com.medplum.types.fhir.Timing) // optional {@link NutritionOrder_Administration#schedule() schedule}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_Administration#extension() extension}
   *    .id(String) // optional {@link NutritionOrder_Administration#id() id}
   *    .build();
   * </pre>
   * @return A new NutritionOrder_Administration builder
   */
  public static ImmutableNutritionOrder_Administration.Builder builder() {
    return new ImmutableNutritionOrder_Administration.Builder();
  }

  /**
   * Builds instances of type {@link NutritionOrder_Administration NutritionOrder_Administration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NutritionOrder_Administration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RATE_QUANTITY = 0x1L;
    private static final long OPT_BIT_RATE_RATIO = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_QUANTITY = 0x8L;
    private static final long OPT_BIT_SCHEDULE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private long optBits;

    private @Nullable Quantity rateQuantity;
    private @Nullable Ratio rateRatio;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity quantity;
    private @Nullable Timing schedule;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Administration#rateQuantity() rateQuantity} to rateQuantity.
     * @param rateQuantity The value for rateQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder rateQuantity(Quantity rateQuantity) {
      checkNotIsSet(rateQuantityIsSet(), "rateQuantity");
      this.rateQuantity = Objects.requireNonNull(rateQuantity, "rateQuantity");
      optBits |= OPT_BIT_RATE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Administration#rateQuantity() rateQuantity} to rateQuantity.
     * @param rateQuantity The value for rateQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rateQuantity")
    public final Builder rateQuantity(Optional<? extends Quantity> rateQuantity) {
      checkNotIsSet(rateQuantityIsSet(), "rateQuantity");
      this.rateQuantity = rateQuantity.orElse(null);
      optBits |= OPT_BIT_RATE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Administration#rateRatio() rateRatio} to rateRatio.
     * @param rateRatio The value for rateRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder rateRatio(Ratio rateRatio) {
      checkNotIsSet(rateRatioIsSet(), "rateRatio");
      this.rateRatio = Objects.requireNonNull(rateRatio, "rateRatio");
      optBits |= OPT_BIT_RATE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Administration#rateRatio() rateRatio} to rateRatio.
     * @param rateRatio The value for rateRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rateRatio")
    public final Builder rateRatio(Optional<? extends Ratio> rateRatio) {
      checkNotIsSet(rateRatioIsSet(), "rateRatio");
      this.rateRatio = rateRatio.orElse(null);
      optBits |= OPT_BIT_RATE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Administration#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder_Administration#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder_Administration#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link NutritionOrder_Administration#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link NutritionOrder_Administration#schedule() schedule} to schedule.
     * @param schedule The value for schedule
     * @return {@code this} builder for chained invocation
     */
    public final Builder schedule(Timing schedule) {
      checkNotIsSet(scheduleIsSet(), "schedule");
      this.schedule = Objects.requireNonNull(schedule, "schedule");
      optBits |= OPT_BIT_SCHEDULE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Administration#schedule() schedule} to schedule.
     * @param schedule The value for schedule
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("schedule")
    public final Builder schedule(Optional<? extends Timing> schedule) {
      checkNotIsSet(scheduleIsSet(), "schedule");
      this.schedule = schedule.orElse(null);
      optBits |= OPT_BIT_SCHEDULE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Administration#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder_Administration#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder_Administration#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder_Administration#id() id} to id.
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
     * Builds a new {@link NutritionOrder_Administration NutritionOrder_Administration}.
     * @return An immutable instance of NutritionOrder_Administration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public NutritionOrder_Administration build() {
      return new ImmutableNutritionOrder_Administration(rateQuantity, rateRatio, modifierExtension, quantity, schedule, extension, id);
    }

    private boolean rateQuantityIsSet() {
      return (optBits & OPT_BIT_RATE_QUANTITY) != 0;
    }

    private boolean rateRatioIsSet() {
      return (optBits & OPT_BIT_RATE_RATIO) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean scheduleIsSet() {
      return (optBits & OPT_BIT_SCHEDULE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of NutritionOrder_Administration is strict, attribute is already set: ".concat(name));
    }
  }
}
