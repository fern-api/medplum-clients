package com.fhir;

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
 * Immutable implementation of {@link NutritionOrder_OralDiet}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNutritionOrder_OralDiet.builder()}.
 */
@Generated(from = "NutritionOrder_OralDiet", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNutritionOrder_OralDiet implements NutritionOrder_OralDiet {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String instruction;
  private final @Nullable List<Timing> schedule;
  private final @Nullable List<NutritionOrder_Nutrient> nutrient;
  private final @Nullable List<NutritionOrder_Texture> texture;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable List<CodeableConcept> fluidConsistencyType;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableNutritionOrder_OralDiet(
      @Nullable List<Extension> modifierExtension,
      @Nullable String instruction,
      @Nullable List<Timing> schedule,
      @Nullable List<NutritionOrder_Nutrient> nutrient,
      @Nullable List<NutritionOrder_Texture> texture,
      @Nullable List<CodeableConcept> type,
      @Nullable List<CodeableConcept> fluidConsistencyType,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.instruction = instruction;
    this.schedule = schedule;
    this.nutrient = nutrient;
    this.texture = texture;
    this.type = type;
    this.fluidConsistencyType = fluidConsistencyType;
    this.extension = extension;
    this.id = id;
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
   * @return The value of the {@code instruction} attribute
   */
  @JsonProperty("instruction")
  @Override
  public Optional<String> instruction() {
    return Optional.ofNullable(instruction);
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
   * @return The value of the {@code nutrient} attribute
   */
  @JsonProperty("nutrient")
  @Override
  public Optional<List<NutritionOrder_Nutrient>> nutrient() {
    return Optional.ofNullable(nutrient);
  }

  /**
   * @return The value of the {@code texture} attribute
   */
  @JsonProperty("texture")
  @Override
  public Optional<List<NutritionOrder_Texture>> texture() {
    return Optional.ofNullable(texture);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<List<CodeableConcept>> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code fluidConsistencyType} attribute
   */
  @JsonProperty("fluidConsistencyType")
  @Override
  public Optional<List<CodeableConcept>> fluidConsistencyType() {
    return Optional.ofNullable(fluidConsistencyType);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_OralDiet#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableNutritionOrder_OralDiet(
        newValue,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_OralDiet#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_OralDiet withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableNutritionOrder_OralDiet(
        value,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_OralDiet#instruction() instruction} attribute.
   * @param value The value for instruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withInstruction(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "instruction");
    if (Objects.equals(this.instruction, newValue)) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        newValue,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_OralDiet#instruction() instruction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withInstruction(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.instruction, value)) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        value,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_OralDiet#schedule() schedule} attribute.
   * @param value The value for schedule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withSchedule(List<Timing> value) {
    @Nullable List<Timing> newValue = Objects.requireNonNull(value, "schedule");
    if (this.schedule == newValue) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        newValue,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_OralDiet#schedule() schedule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for schedule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_OralDiet withSchedule(Optional<? extends List<Timing>> optional) {
    @Nullable List<Timing> value = optional.orElse(null);
    if (this.schedule == value) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        value,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_OralDiet#nutrient() nutrient} attribute.
   * @param value The value for nutrient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withNutrient(List<NutritionOrder_Nutrient> value) {
    @Nullable List<NutritionOrder_Nutrient> newValue = Objects.requireNonNull(value, "nutrient");
    if (this.nutrient == newValue) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        newValue,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_OralDiet#nutrient() nutrient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nutrient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_OralDiet withNutrient(Optional<? extends List<NutritionOrder_Nutrient>> optional) {
    @Nullable List<NutritionOrder_Nutrient> value = optional.orElse(null);
    if (this.nutrient == value) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        value,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_OralDiet#texture() texture} attribute.
   * @param value The value for texture
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withTexture(List<NutritionOrder_Texture> value) {
    @Nullable List<NutritionOrder_Texture> newValue = Objects.requireNonNull(value, "texture");
    if (this.texture == newValue) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        newValue,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_OralDiet#texture() texture} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for texture
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_OralDiet withTexture(Optional<? extends List<NutritionOrder_Texture>> optional) {
    @Nullable List<NutritionOrder_Texture> value = optional.orElse(null);
    if (this.texture == value) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        value,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_OralDiet#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        newValue,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_OralDiet#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_OralDiet withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        value,
        this.fluidConsistencyType,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_OralDiet#fluidConsistencyType() fluidConsistencyType} attribute.
   * @param value The value for fluidConsistencyType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withFluidConsistencyType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "fluidConsistencyType");
    if (this.fluidConsistencyType == newValue) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        newValue,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_OralDiet#fluidConsistencyType() fluidConsistencyType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fluidConsistencyType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_OralDiet withFluidConsistencyType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.fluidConsistencyType == value) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        value,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_OralDiet#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_OralDiet#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_OralDiet withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_OralDiet#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_OralDiet#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_OralDiet withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableNutritionOrder_OralDiet(
        this.modifierExtension,
        this.instruction,
        this.schedule,
        this.nutrient,
        this.texture,
        this.type,
        this.fluidConsistencyType,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNutritionOrder_OralDiet} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNutritionOrder_OralDiet
        && equalTo((ImmutableNutritionOrder_OralDiet) another);
  }

  private boolean equalTo(ImmutableNutritionOrder_OralDiet another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(instruction, another.instruction)
        && Objects.equals(schedule, another.schedule)
        && Objects.equals(nutrient, another.nutrient)
        && Objects.equals(texture, another.texture)
        && Objects.equals(type, another.type)
        && Objects.equals(fluidConsistencyType, another.fluidConsistencyType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code instruction}, {@code schedule}, {@code nutrient}, {@code texture}, {@code type}, {@code fluidConsistencyType}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(instruction);
    h += (h << 5) + Objects.hashCode(schedule);
    h += (h << 5) + Objects.hashCode(nutrient);
    h += (h << 5) + Objects.hashCode(texture);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(fluidConsistencyType);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code NutritionOrder_OralDiet} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("NutritionOrder_OralDiet{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (instruction != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("instruction=").append(instruction);
    }
    if (schedule != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("schedule=").append(schedule);
    }
    if (nutrient != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("nutrient=").append(nutrient);
    }
    if (texture != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("texture=").append(texture);
    }
    if (type != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (fluidConsistencyType != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("fluidConsistencyType=").append(fluidConsistencyType);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "NutritionOrder_OralDiet", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NutritionOrder_OralDiet {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> instruction = Optional.empty();
    boolean instructionIsSet;
    @Nullable Optional<List<Timing>> schedule = Optional.empty();
    boolean scheduleIsSet;
    @Nullable Optional<List<NutritionOrder_Nutrient>> nutrient = Optional.empty();
    boolean nutrientIsSet;
    @Nullable Optional<List<NutritionOrder_Texture>> texture = Optional.empty();
    boolean textureIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<CodeableConcept>> fluidConsistencyType = Optional.empty();
    boolean fluidConsistencyTypeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("instruction")
    public void setInstruction(Optional<String> instruction) {
      this.instruction = instruction;
      this.instructionIsSet = true;
    }
    @JsonProperty("schedule")
    public void setSchedule(Optional<List<Timing>> schedule) {
      this.schedule = schedule;
      this.scheduleIsSet = true;
    }
    @JsonProperty("nutrient")
    public void setNutrient(Optional<List<NutritionOrder_Nutrient>> nutrient) {
      this.nutrient = nutrient;
      this.nutrientIsSet = true;
    }
    @JsonProperty("texture")
    public void setTexture(Optional<List<NutritionOrder_Texture>> texture) {
      this.texture = texture;
      this.textureIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("fluidConsistencyType")
    public void setFluidConsistencyType(Optional<List<CodeableConcept>> fluidConsistencyType) {
      this.fluidConsistencyType = fluidConsistencyType;
      this.fluidConsistencyTypeIsSet = true;
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
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> instruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Timing>> schedule() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<NutritionOrder_Nutrient>> nutrient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<NutritionOrder_Texture>> texture() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> fluidConsistencyType() { throw new UnsupportedOperationException(); }
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
  static ImmutableNutritionOrder_OralDiet fromJson(Json json) {
    ImmutableNutritionOrder_OralDiet.Builder builder = ImmutableNutritionOrder_OralDiet.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.instructionIsSet) {
      builder.instruction(json.instruction);
    }
    if (json.scheduleIsSet) {
      builder.schedule(json.schedule);
    }
    if (json.nutrientIsSet) {
      builder.nutrient(json.nutrient);
    }
    if (json.textureIsSet) {
      builder.texture(json.texture);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.fluidConsistencyTypeIsSet) {
      builder.fluidConsistencyType(json.fluidConsistencyType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableNutritionOrder_OralDiet) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NutritionOrder_OralDiet} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NutritionOrder_OralDiet instance
   */
  public static NutritionOrder_OralDiet copyOf(NutritionOrder_OralDiet instance) {
    if (instance instanceof ImmutableNutritionOrder_OralDiet) {
      return (ImmutableNutritionOrder_OralDiet) instance;
    }
    return ImmutableNutritionOrder_OralDiet.builder()
        .modifierExtension(instance.modifierExtension())
        .instruction(instance.instruction())
        .schedule(instance.schedule())
        .nutrient(instance.nutrient())
        .texture(instance.texture())
        .type(instance.type())
        .fluidConsistencyType(instance.fluidConsistencyType())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link NutritionOrder_OralDiet NutritionOrder_OralDiet}.
   * <pre>
   * ImmutableNutritionOrder_OralDiet.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_OralDiet#modifierExtension() modifierExtension}
   *    .instruction(String) // optional {@link NutritionOrder_OralDiet#instruction() instruction}
   *    .schedule(List&amp;lt;com.fhir.Timing&amp;gt;) // optional {@link NutritionOrder_OralDiet#schedule() schedule}
   *    .nutrient(List&amp;lt;com.fhir.NutritionOrder_Nutrient&amp;gt;) // optional {@link NutritionOrder_OralDiet#nutrient() nutrient}
   *    .texture(List&amp;lt;com.fhir.NutritionOrder_Texture&amp;gt;) // optional {@link NutritionOrder_OralDiet#texture() texture}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link NutritionOrder_OralDiet#type() type}
   *    .fluidConsistencyType(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link NutritionOrder_OralDiet#fluidConsistencyType() fluidConsistencyType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_OralDiet#extension() extension}
   *    .id(String) // optional {@link NutritionOrder_OralDiet#id() id}
   *    .build();
   * </pre>
   * @return A new NutritionOrder_OralDiet builder
   */
  public static ImmutableNutritionOrder_OralDiet.Builder builder() {
    return new ImmutableNutritionOrder_OralDiet.Builder();
  }

  /**
   * Builds instances of type {@link NutritionOrder_OralDiet NutritionOrder_OralDiet}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NutritionOrder_OralDiet", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_INSTRUCTION = 0x2L;
    private static final long OPT_BIT_SCHEDULE = 0x4L;
    private static final long OPT_BIT_NUTRIENT = 0x8L;
    private static final long OPT_BIT_TEXTURE = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_FLUID_CONSISTENCY_TYPE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String instruction;
    private @Nullable List<Timing> schedule;
    private @Nullable List<NutritionOrder_Nutrient> nutrient;
    private @Nullable List<NutritionOrder_Texture> texture;
    private @Nullable List<CodeableConcept> type;
    private @Nullable List<CodeableConcept> fluidConsistencyType;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link NutritionOrder_OralDiet#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder_OralDiet#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder_OralDiet#instruction() instruction} to instruction.
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
     * Initializes the optional value {@link NutritionOrder_OralDiet#instruction() instruction} to instruction.
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
     * Initializes the optional value {@link NutritionOrder_OralDiet#schedule() schedule} to schedule.
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
     * Initializes the optional value {@link NutritionOrder_OralDiet#schedule() schedule} to schedule.
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
     * Initializes the optional value {@link NutritionOrder_OralDiet#nutrient() nutrient} to nutrient.
     * @param nutrient The value for nutrient
     * @return {@code this} builder for chained invocation
     */
    public final Builder nutrient(List<NutritionOrder_Nutrient> nutrient) {
      checkNotIsSet(nutrientIsSet(), "nutrient");
      this.nutrient = Objects.requireNonNull(nutrient, "nutrient");
      optBits |= OPT_BIT_NUTRIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_OralDiet#nutrient() nutrient} to nutrient.
     * @param nutrient The value for nutrient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nutrient")
    public final Builder nutrient(Optional<? extends List<NutritionOrder_Nutrient>> nutrient) {
      checkNotIsSet(nutrientIsSet(), "nutrient");
      this.nutrient = nutrient.orElse(null);
      optBits |= OPT_BIT_NUTRIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_OralDiet#texture() texture} to texture.
     * @param texture The value for texture
     * @return {@code this} builder for chained invocation
     */
    public final Builder texture(List<NutritionOrder_Texture> texture) {
      checkNotIsSet(textureIsSet(), "texture");
      this.texture = Objects.requireNonNull(texture, "texture");
      optBits |= OPT_BIT_TEXTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_OralDiet#texture() texture} to texture.
     * @param texture The value for texture
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("texture")
    public final Builder texture(Optional<? extends List<NutritionOrder_Texture>> texture) {
      checkNotIsSet(textureIsSet(), "texture");
      this.texture = texture.orElse(null);
      optBits |= OPT_BIT_TEXTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_OralDiet#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_OralDiet#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_OralDiet#fluidConsistencyType() fluidConsistencyType} to fluidConsistencyType.
     * @param fluidConsistencyType The value for fluidConsistencyType
     * @return {@code this} builder for chained invocation
     */
    public final Builder fluidConsistencyType(List<CodeableConcept> fluidConsistencyType) {
      checkNotIsSet(fluidConsistencyTypeIsSet(), "fluidConsistencyType");
      this.fluidConsistencyType = Objects.requireNonNull(fluidConsistencyType, "fluidConsistencyType");
      optBits |= OPT_BIT_FLUID_CONSISTENCY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_OralDiet#fluidConsistencyType() fluidConsistencyType} to fluidConsistencyType.
     * @param fluidConsistencyType The value for fluidConsistencyType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fluidConsistencyType")
    public final Builder fluidConsistencyType(Optional<? extends List<CodeableConcept>> fluidConsistencyType) {
      checkNotIsSet(fluidConsistencyTypeIsSet(), "fluidConsistencyType");
      this.fluidConsistencyType = fluidConsistencyType.orElse(null);
      optBits |= OPT_BIT_FLUID_CONSISTENCY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_OralDiet#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder_OralDiet#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder_OralDiet#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder_OralDiet#id() id} to id.
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
     * Builds a new {@link NutritionOrder_OralDiet NutritionOrder_OralDiet}.
     * @return An immutable instance of NutritionOrder_OralDiet
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public NutritionOrder_OralDiet build() {
      return new ImmutableNutritionOrder_OralDiet(
          modifierExtension,
          instruction,
          schedule,
          nutrient,
          texture,
          type,
          fluidConsistencyType,
          extension,
          id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean instructionIsSet() {
      return (optBits & OPT_BIT_INSTRUCTION) != 0;
    }

    private boolean scheduleIsSet() {
      return (optBits & OPT_BIT_SCHEDULE) != 0;
    }

    private boolean nutrientIsSet() {
      return (optBits & OPT_BIT_NUTRIENT) != 0;
    }

    private boolean textureIsSet() {
      return (optBits & OPT_BIT_TEXTURE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean fluidConsistencyTypeIsSet() {
      return (optBits & OPT_BIT_FLUID_CONSISTENCY_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of NutritionOrder_OralDiet is strict, attribute is already set: ".concat(name));
    }
  }
}
