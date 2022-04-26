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
 * Immutable implementation of {@link NutritionOrder_Supplement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNutritionOrder_Supplement.builder()}.
 */
@Generated(from = "NutritionOrder_Supplement", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNutritionOrder_Supplement
    implements NutritionOrder_Supplement {
  private final @Nullable Quantity quantity;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Timing> schedule;
  private final @Nullable String productName;
  private final @Nullable List<Extension> extension;
  private final @Nullable String instruction;

  private ImmutableNutritionOrder_Supplement(
      @Nullable Quantity quantity,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable CodeableConcept type,
      @Nullable List<Timing> schedule,
      @Nullable String productName,
      @Nullable List<Extension> extension,
      @Nullable String instruction) {
    this.quantity = quantity;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.type = type;
    this.schedule = schedule;
    this.productName = productName;
    this.extension = extension;
    this.instruction = instruction;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code schedule} attribute
   */
  @JsonProperty("schedule")
  @Override
  public Optional<List<Timing>> schedule() {
    return Optional.ofNullable(schedule);
  }

  /**
   * @return The value of the {@code productName} attribute
   */
  @JsonProperty("productName")
  @Override
  public Optional<String> productName() {
    return Optional.ofNullable(productName);
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
   * @return The value of the {@code instruction} attribute
   */
  @JsonProperty("instruction")
  @Override
  public Optional<String> instruction() {
    return Optional.ofNullable(instruction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Supplement#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableNutritionOrder_Supplement(
        newValue,
        this.modifierExtension,
        this.id,
        this.type,
        this.schedule,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Supplement#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Supplement withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableNutritionOrder_Supplement(
        value,
        this.modifierExtension,
        this.id,
        this.type,
        this.schedule,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Supplement#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        newValue,
        this.id,
        this.type,
        this.schedule,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Supplement#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Supplement withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        value,
        this.id,
        this.type,
        this.schedule,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Supplement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        newValue,
        this.type,
        this.schedule,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Supplement#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        value,
        this.type,
        this.schedule,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Supplement#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        newValue,
        this.schedule,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Supplement#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Supplement withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        value,
        this.schedule,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Supplement#schedule() schedule} attribute.
   * @param value The value for schedule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withSchedule(List<Timing> value) {
    @Nullable List<Timing> newValue = Objects.requireNonNull(value, "schedule");
    if (this.schedule == newValue) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        this.type,
        newValue,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Supplement#schedule() schedule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for schedule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Supplement withSchedule(Optional<? extends List<Timing>> optional) {
    @Nullable List<Timing> value = optional.orElse(null);
    if (this.schedule == value) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        this.type,
        value,
        this.productName,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Supplement#productName() productName} attribute.
   * @param value The value for productName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withProductName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "productName");
    if (Objects.equals(this.productName, newValue)) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        this.type,
        this.schedule,
        newValue,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Supplement#productName() productName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withProductName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.productName, value)) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        this.type,
        this.schedule,
        value,
        this.extension,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Supplement#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        this.type,
        this.schedule,
        this.productName,
        newValue,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Supplement#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_Supplement withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        this.type,
        this.schedule,
        this.productName,
        value,
        this.instruction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_Supplement#instruction() instruction} attribute.
   * @param value The value for instruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withInstruction(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "instruction");
    if (Objects.equals(this.instruction, newValue)) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        this.type,
        this.schedule,
        this.productName,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_Supplement#instruction() instruction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_Supplement withInstruction(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.instruction, value)) return this;
    return new ImmutableNutritionOrder_Supplement(
        this.quantity,
        this.modifierExtension,
        this.id,
        this.type,
        this.schedule,
        this.productName,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNutritionOrder_Supplement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNutritionOrder_Supplement
        && equalTo((ImmutableNutritionOrder_Supplement) another);
  }

  private boolean equalTo(ImmutableNutritionOrder_Supplement another) {
    return Objects.equals(quantity, another.quantity)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(schedule, another.schedule)
        && Objects.equals(productName, another.productName)
        && Objects.equals(extension, another.extension)
        && Objects.equals(instruction, another.instruction);
  }

  /**
   * Computes a hash code from attributes: {@code quantity}, {@code modifierExtension}, {@code id}, {@code type}, {@code schedule}, {@code productName}, {@code extension}, {@code instruction}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(schedule);
    h += (h << 5) + Objects.hashCode(productName);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(instruction);
    return h;
  }

  /**
   * Prints the immutable value {@code NutritionOrder_Supplement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("NutritionOrder_Supplement{");
    if (quantity != null) {
      builder.append("quantity=").append(quantity);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (schedule != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("schedule=").append(schedule);
    }
    if (productName != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("productName=").append(productName);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (instruction != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("instruction=").append(instruction);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "NutritionOrder_Supplement", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NutritionOrder_Supplement {
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Timing>> schedule = Optional.empty();
    boolean scheduleIsSet;
    @Nullable Optional<String> productName = Optional.empty();
    boolean productNameIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> instruction = Optional.empty();
    boolean instructionIsSet;
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
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
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("schedule")
    public void setSchedule(Optional<List<Timing>> schedule) {
      this.schedule = schedule;
      this.scheduleIsSet = true;
    }
    @JsonProperty("productName")
    public void setProductName(Optional<String> productName) {
      this.productName = productName;
      this.productNameIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("instruction")
    public void setInstruction(Optional<String> instruction) {
      this.instruction = instruction;
      this.instructionIsSet = true;
    }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Timing>> schedule() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> productName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> instruction() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNutritionOrder_Supplement fromJson(Json json) {
    ImmutableNutritionOrder_Supplement.Builder builder = ImmutableNutritionOrder_Supplement.builder();
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.scheduleIsSet) {
      builder.schedule(json.schedule);
    }
    if (json.productNameIsSet) {
      builder.productName(json.productName);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.instructionIsSet) {
      builder.instruction(json.instruction);
    }
    return (ImmutableNutritionOrder_Supplement) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NutritionOrder_Supplement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NutritionOrder_Supplement instance
   */
  public static NutritionOrder_Supplement copyOf(NutritionOrder_Supplement instance) {
    if (instance instanceof ImmutableNutritionOrder_Supplement) {
      return (ImmutableNutritionOrder_Supplement) instance;
    }
    return ImmutableNutritionOrder_Supplement.builder()
        .quantity(instance.quantity())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .type(instance.type())
        .schedule(instance.schedule())
        .productName(instance.productName())
        .extension(instance.extension())
        .instruction(instance.instruction())
        .build();
  }

  /**
   * Creates a builder for {@link NutritionOrder_Supplement NutritionOrder_Supplement}.
   * <pre>
   * ImmutableNutritionOrder_Supplement.builder()
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link NutritionOrder_Supplement#quantity() quantity}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_Supplement#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link NutritionOrder_Supplement#id() id}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link NutritionOrder_Supplement#type() type}
   *    .schedule(List&amp;lt;com.medplum.types.fhir.Timing&amp;gt;) // optional {@link NutritionOrder_Supplement#schedule() schedule}
   *    .productName(String) // optional {@link NutritionOrder_Supplement#productName() productName}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_Supplement#extension() extension}
   *    .instruction(String) // optional {@link NutritionOrder_Supplement#instruction() instruction}
   *    .build();
   * </pre>
   * @return A new NutritionOrder_Supplement builder
   */
  public static ImmutableNutritionOrder_Supplement.Builder builder() {
    return new ImmutableNutritionOrder_Supplement.Builder();
  }

  /**
   * Builds instances of type {@link NutritionOrder_Supplement NutritionOrder_Supplement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NutritionOrder_Supplement", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_QUANTITY = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_SCHEDULE = 0x10L;
    private static final long OPT_BIT_PRODUCT_NAME = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_INSTRUCTION = 0x80L;
    private long optBits;

    private @Nullable Quantity quantity;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable List<Timing> schedule;
    private @Nullable String productName;
    private @Nullable List<Extension> extension;
    private @Nullable String instruction;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Supplement#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#type() type} to type.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#type() type} to type.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#schedule() schedule} to schedule.
     * @param schedule The value for schedule
     * @return {@code this} builder for chained invocation
     */
    public final Builder schedule(List<Timing> schedule) {
      checkNotIsSet(scheduleIsSet(), "schedule");
      this.schedule = Objects.requireNonNull(schedule, "schedule");
      optBits |= OPT_BIT_SCHEDULE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Supplement#schedule() schedule} to schedule.
     * @param schedule The value for schedule
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("schedule")
    public final Builder schedule(Optional<? extends List<Timing>> schedule) {
      checkNotIsSet(scheduleIsSet(), "schedule");
      this.schedule = schedule.orElse(null);
      optBits |= OPT_BIT_SCHEDULE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Supplement#productName() productName} to productName.
     * @param productName The value for productName
     * @return {@code this} builder for chained invocation
     */
    public final Builder productName(String productName) {
      checkNotIsSet(productNameIsSet(), "productName");
      this.productName = Objects.requireNonNull(productName, "productName");
      optBits |= OPT_BIT_PRODUCT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Supplement#productName() productName} to productName.
     * @param productName The value for productName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productName")
    public final Builder productName(Optional<String> productName) {
      checkNotIsSet(productNameIsSet(), "productName");
      this.productName = productName.orElse(null);
      optBits |= OPT_BIT_PRODUCT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Supplement#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder_Supplement#instruction() instruction} to instruction.
     * @param instruction The value for instruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder instruction(String instruction) {
      checkNotIsSet(instructionIsSet(), "instruction");
      this.instruction = Objects.requireNonNull(instruction, "instruction");
      optBits |= OPT_BIT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_Supplement#instruction() instruction} to instruction.
     * @param instruction The value for instruction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instruction")
    public final Builder instruction(Optional<String> instruction) {
      checkNotIsSet(instructionIsSet(), "instruction");
      this.instruction = instruction.orElse(null);
      optBits |= OPT_BIT_INSTRUCTION;
      return this;
    }

    /**
     * Builds a new {@link NutritionOrder_Supplement NutritionOrder_Supplement}.
     * @return An immutable instance of NutritionOrder_Supplement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public NutritionOrder_Supplement build() {
      return new ImmutableNutritionOrder_Supplement(quantity, modifierExtension, id, type, schedule, productName, extension, instruction);
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean scheduleIsSet() {
      return (optBits & OPT_BIT_SCHEDULE) != 0;
    }

    private boolean productNameIsSet() {
      return (optBits & OPT_BIT_PRODUCT_NAME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean instructionIsSet() {
      return (optBits & OPT_BIT_INSTRUCTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of NutritionOrder_Supplement is strict, attribute is already set: ".concat(name));
    }
  }
}
