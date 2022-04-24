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
 * Immutable implementation of {@link SubstanceSourceMaterial_Hybrid}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSourceMaterial_Hybrid.builder()}.
 */
@Generated(from = "SubstanceSourceMaterial_Hybrid", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSourceMaterial_Hybrid implements SubstanceSourceMaterial_Hybrid {
  private final @Nullable String maternalOrganismName;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String paternalOrganismId;
  private final @Nullable String paternalOrganismName;
  private final @Nullable CodeableConcept hybridType;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable String maternalOrganismId;

  private ImmutableSubstanceSourceMaterial_Hybrid(
      @Nullable String maternalOrganismName,
      @Nullable List<Extension> modifierExtension,
      @Nullable String paternalOrganismId,
      @Nullable String paternalOrganismName,
      @Nullable CodeableConcept hybridType,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable String maternalOrganismId) {
    this.maternalOrganismName = maternalOrganismName;
    this.modifierExtension = modifierExtension;
    this.paternalOrganismId = paternalOrganismId;
    this.paternalOrganismName = paternalOrganismName;
    this.hybridType = hybridType;
    this.id = id;
    this.extension = extension;
    this.maternalOrganismId = maternalOrganismId;
  }

  /**
   * @return The value of the {@code maternalOrganismName} attribute
   */
  @JsonProperty("maternalOrganismName")
  @Override
  public Optional<String> maternalOrganismName() {
    return Optional.ofNullable(maternalOrganismName);
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
   * @return The value of the {@code paternalOrganismId} attribute
   */
  @JsonProperty("paternalOrganismId")
  @Override
  public Optional<String> paternalOrganismId() {
    return Optional.ofNullable(paternalOrganismId);
  }

  /**
   * @return The value of the {@code paternalOrganismName} attribute
   */
  @JsonProperty("paternalOrganismName")
  @Override
  public Optional<String> paternalOrganismName() {
    return Optional.ofNullable(paternalOrganismName);
  }

  /**
   * @return The value of the {@code hybridType} attribute
   */
  @JsonProperty("hybridType")
  @Override
  public Optional<CodeableConcept> hybridType() {
    return Optional.ofNullable(hybridType);
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
   * @return The value of the {@code maternalOrganismId} attribute
   */
  @JsonProperty("maternalOrganismId")
  @Override
  public Optional<String> maternalOrganismId() {
    return Optional.ofNullable(maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Hybrid#maternalOrganismName() maternalOrganismName} attribute.
   * @param value The value for maternalOrganismName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withMaternalOrganismName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "maternalOrganismName");
    if (Objects.equals(this.maternalOrganismName, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        newValue,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Hybrid#maternalOrganismName() maternalOrganismName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maternalOrganismName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withMaternalOrganismName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.maternalOrganismName, value)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        value,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Hybrid#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        newValue,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Hybrid#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Hybrid withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        value,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Hybrid#paternalOrganismId() paternalOrganismId} attribute.
   * @param value The value for paternalOrganismId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withPaternalOrganismId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "paternalOrganismId");
    if (Objects.equals(this.paternalOrganismId, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        newValue,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Hybrid#paternalOrganismId() paternalOrganismId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paternalOrganismId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withPaternalOrganismId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.paternalOrganismId, value)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        value,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Hybrid#paternalOrganismName() paternalOrganismName} attribute.
   * @param value The value for paternalOrganismName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withPaternalOrganismName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "paternalOrganismName");
    if (Objects.equals(this.paternalOrganismName, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        newValue,
        this.hybridType,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Hybrid#paternalOrganismName() paternalOrganismName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paternalOrganismName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withPaternalOrganismName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.paternalOrganismName, value)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        value,
        this.hybridType,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Hybrid#hybridType() hybridType} attribute.
   * @param value The value for hybridType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withHybridType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "hybridType");
    if (this.hybridType == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        newValue,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Hybrid#hybridType() hybridType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hybridType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Hybrid withHybridType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.hybridType == value) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        value,
        this.id,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Hybrid#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        newValue,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Hybrid#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        value,
        this.extension,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Hybrid#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        newValue,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Hybrid#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Hybrid withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        value,
        this.maternalOrganismId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Hybrid#maternalOrganismId() maternalOrganismId} attribute.
   * @param value The value for maternalOrganismId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withMaternalOrganismId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "maternalOrganismId");
    if (Objects.equals(this.maternalOrganismId, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Hybrid#maternalOrganismId() maternalOrganismId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maternalOrganismId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Hybrid withMaternalOrganismId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.maternalOrganismId, value)) return this;
    return new ImmutableSubstanceSourceMaterial_Hybrid(
        this.maternalOrganismName,
        this.modifierExtension,
        this.paternalOrganismId,
        this.paternalOrganismName,
        this.hybridType,
        this.id,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSourceMaterial_Hybrid} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSourceMaterial_Hybrid
        && equalTo((ImmutableSubstanceSourceMaterial_Hybrid) another);
  }

  private boolean equalTo(ImmutableSubstanceSourceMaterial_Hybrid another) {
    return Objects.equals(maternalOrganismName, another.maternalOrganismName)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(paternalOrganismId, another.paternalOrganismId)
        && Objects.equals(paternalOrganismName, another.paternalOrganismName)
        && Objects.equals(hybridType, another.hybridType)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(maternalOrganismId, another.maternalOrganismId);
  }

  /**
   * Computes a hash code from attributes: {@code maternalOrganismName}, {@code modifierExtension}, {@code paternalOrganismId}, {@code paternalOrganismName}, {@code hybridType}, {@code id}, {@code extension}, {@code maternalOrganismId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(maternalOrganismName);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(paternalOrganismId);
    h += (h << 5) + Objects.hashCode(paternalOrganismName);
    h += (h << 5) + Objects.hashCode(hybridType);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(maternalOrganismId);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSourceMaterial_Hybrid} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSourceMaterial_Hybrid{");
    if (maternalOrganismName != null) {
      builder.append("maternalOrganismName=").append(maternalOrganismName);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (paternalOrganismId != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("paternalOrganismId=").append(paternalOrganismId);
    }
    if (paternalOrganismName != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("paternalOrganismName=").append(paternalOrganismName);
    }
    if (hybridType != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("hybridType=").append(hybridType);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (maternalOrganismId != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("maternalOrganismId=").append(maternalOrganismId);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSourceMaterial_Hybrid", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSourceMaterial_Hybrid {
    @Nullable Optional<String> maternalOrganismName = Optional.empty();
    boolean maternalOrganismNameIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> paternalOrganismId = Optional.empty();
    boolean paternalOrganismIdIsSet;
    @Nullable Optional<String> paternalOrganismName = Optional.empty();
    boolean paternalOrganismNameIsSet;
    @Nullable Optional<CodeableConcept> hybridType = Optional.empty();
    boolean hybridTypeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> maternalOrganismId = Optional.empty();
    boolean maternalOrganismIdIsSet;
    @JsonProperty("maternalOrganismName")
    public void setMaternalOrganismName(Optional<String> maternalOrganismName) {
      this.maternalOrganismName = maternalOrganismName;
      this.maternalOrganismNameIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("paternalOrganismId")
    public void setPaternalOrganismId(Optional<String> paternalOrganismId) {
      this.paternalOrganismId = paternalOrganismId;
      this.paternalOrganismIdIsSet = true;
    }
    @JsonProperty("paternalOrganismName")
    public void setPaternalOrganismName(Optional<String> paternalOrganismName) {
      this.paternalOrganismName = paternalOrganismName;
      this.paternalOrganismNameIsSet = true;
    }
    @JsonProperty("hybridType")
    public void setHybridType(Optional<CodeableConcept> hybridType) {
      this.hybridType = hybridType;
      this.hybridTypeIsSet = true;
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
    @JsonProperty("maternalOrganismId")
    public void setMaternalOrganismId(Optional<String> maternalOrganismId) {
      this.maternalOrganismId = maternalOrganismId;
      this.maternalOrganismIdIsSet = true;
    }
    @Override
    public Optional<String> maternalOrganismName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> paternalOrganismId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> paternalOrganismName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> hybridType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> maternalOrganismId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSourceMaterial_Hybrid fromJson(Json json) {
    ImmutableSubstanceSourceMaterial_Hybrid.Builder builder = ImmutableSubstanceSourceMaterial_Hybrid.builder();
    if (json.maternalOrganismNameIsSet) {
      builder.maternalOrganismName(json.maternalOrganismName);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.paternalOrganismIdIsSet) {
      builder.paternalOrganismId(json.paternalOrganismId);
    }
    if (json.paternalOrganismNameIsSet) {
      builder.paternalOrganismName(json.paternalOrganismName);
    }
    if (json.hybridTypeIsSet) {
      builder.hybridType(json.hybridType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.maternalOrganismIdIsSet) {
      builder.maternalOrganismId(json.maternalOrganismId);
    }
    return (ImmutableSubstanceSourceMaterial_Hybrid) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSourceMaterial_Hybrid} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSourceMaterial_Hybrid instance
   */
  public static SubstanceSourceMaterial_Hybrid copyOf(SubstanceSourceMaterial_Hybrid instance) {
    if (instance instanceof ImmutableSubstanceSourceMaterial_Hybrid) {
      return (ImmutableSubstanceSourceMaterial_Hybrid) instance;
    }
    return ImmutableSubstanceSourceMaterial_Hybrid.builder()
        .maternalOrganismName(instance.maternalOrganismName())
        .modifierExtension(instance.modifierExtension())
        .paternalOrganismId(instance.paternalOrganismId())
        .paternalOrganismName(instance.paternalOrganismName())
        .hybridType(instance.hybridType())
        .id(instance.id())
        .extension(instance.extension())
        .maternalOrganismId(instance.maternalOrganismId())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSourceMaterial_Hybrid SubstanceSourceMaterial_Hybrid}.
   * <pre>
   * ImmutableSubstanceSourceMaterial_Hybrid.builder()
   *    .maternalOrganismName(String) // optional {@link SubstanceSourceMaterial_Hybrid#maternalOrganismName() maternalOrganismName}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_Hybrid#modifierExtension() modifierExtension}
   *    .paternalOrganismId(String) // optional {@link SubstanceSourceMaterial_Hybrid#paternalOrganismId() paternalOrganismId}
   *    .paternalOrganismName(String) // optional {@link SubstanceSourceMaterial_Hybrid#paternalOrganismName() paternalOrganismName}
   *    .hybridType(com.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_Hybrid#hybridType() hybridType}
   *    .id(String) // optional {@link SubstanceSourceMaterial_Hybrid#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_Hybrid#extension() extension}
   *    .maternalOrganismId(String) // optional {@link SubstanceSourceMaterial_Hybrid#maternalOrganismId() maternalOrganismId}
   *    .build();
   * </pre>
   * @return A new SubstanceSourceMaterial_Hybrid builder
   */
  public static ImmutableSubstanceSourceMaterial_Hybrid.Builder builder() {
    return new ImmutableSubstanceSourceMaterial_Hybrid.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSourceMaterial_Hybrid SubstanceSourceMaterial_Hybrid}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSourceMaterial_Hybrid", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MATERNAL_ORGANISM_NAME = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_PATERNAL_ORGANISM_ID = 0x4L;
    private static final long OPT_BIT_PATERNAL_ORGANISM_NAME = 0x8L;
    private static final long OPT_BIT_HYBRID_TYPE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_MATERNAL_ORGANISM_ID = 0x80L;
    private long optBits;

    private @Nullable String maternalOrganismName;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String paternalOrganismId;
    private @Nullable String paternalOrganismName;
    private @Nullable CodeableConcept hybridType;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable String maternalOrganismId;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#maternalOrganismName() maternalOrganismName} to maternalOrganismName.
     * @param maternalOrganismName The value for maternalOrganismName
     * @return {@code this} builder for chained invocation
     */
    public final Builder maternalOrganismName(String maternalOrganismName) {
      checkNotIsSet(maternalOrganismNameIsSet(), "maternalOrganismName");
      this.maternalOrganismName = Objects.requireNonNull(maternalOrganismName, "maternalOrganismName");
      optBits |= OPT_BIT_MATERNAL_ORGANISM_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#maternalOrganismName() maternalOrganismName} to maternalOrganismName.
     * @param maternalOrganismName The value for maternalOrganismName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maternalOrganismName")
    public final Builder maternalOrganismName(Optional<String> maternalOrganismName) {
      checkNotIsSet(maternalOrganismNameIsSet(), "maternalOrganismName");
      this.maternalOrganismName = maternalOrganismName.orElse(null);
      optBits |= OPT_BIT_MATERNAL_ORGANISM_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#paternalOrganismId() paternalOrganismId} to paternalOrganismId.
     * @param paternalOrganismId The value for paternalOrganismId
     * @return {@code this} builder for chained invocation
     */
    public final Builder paternalOrganismId(String paternalOrganismId) {
      checkNotIsSet(paternalOrganismIdIsSet(), "paternalOrganismId");
      this.paternalOrganismId = Objects.requireNonNull(paternalOrganismId, "paternalOrganismId");
      optBits |= OPT_BIT_PATERNAL_ORGANISM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#paternalOrganismId() paternalOrganismId} to paternalOrganismId.
     * @param paternalOrganismId The value for paternalOrganismId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paternalOrganismId")
    public final Builder paternalOrganismId(Optional<String> paternalOrganismId) {
      checkNotIsSet(paternalOrganismIdIsSet(), "paternalOrganismId");
      this.paternalOrganismId = paternalOrganismId.orElse(null);
      optBits |= OPT_BIT_PATERNAL_ORGANISM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#paternalOrganismName() paternalOrganismName} to paternalOrganismName.
     * @param paternalOrganismName The value for paternalOrganismName
     * @return {@code this} builder for chained invocation
     */
    public final Builder paternalOrganismName(String paternalOrganismName) {
      checkNotIsSet(paternalOrganismNameIsSet(), "paternalOrganismName");
      this.paternalOrganismName = Objects.requireNonNull(paternalOrganismName, "paternalOrganismName");
      optBits |= OPT_BIT_PATERNAL_ORGANISM_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#paternalOrganismName() paternalOrganismName} to paternalOrganismName.
     * @param paternalOrganismName The value for paternalOrganismName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paternalOrganismName")
    public final Builder paternalOrganismName(Optional<String> paternalOrganismName) {
      checkNotIsSet(paternalOrganismNameIsSet(), "paternalOrganismName");
      this.paternalOrganismName = paternalOrganismName.orElse(null);
      optBits |= OPT_BIT_PATERNAL_ORGANISM_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#hybridType() hybridType} to hybridType.
     * @param hybridType The value for hybridType
     * @return {@code this} builder for chained invocation
     */
    public final Builder hybridType(CodeableConcept hybridType) {
      checkNotIsSet(hybridTypeIsSet(), "hybridType");
      this.hybridType = Objects.requireNonNull(hybridType, "hybridType");
      optBits |= OPT_BIT_HYBRID_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#hybridType() hybridType} to hybridType.
     * @param hybridType The value for hybridType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hybridType")
    public final Builder hybridType(Optional<? extends CodeableConcept> hybridType) {
      checkNotIsSet(hybridTypeIsSet(), "hybridType");
      this.hybridType = hybridType.orElse(null);
      optBits |= OPT_BIT_HYBRID_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#maternalOrganismId() maternalOrganismId} to maternalOrganismId.
     * @param maternalOrganismId The value for maternalOrganismId
     * @return {@code this} builder for chained invocation
     */
    public final Builder maternalOrganismId(String maternalOrganismId) {
      checkNotIsSet(maternalOrganismIdIsSet(), "maternalOrganismId");
      this.maternalOrganismId = Objects.requireNonNull(maternalOrganismId, "maternalOrganismId");
      optBits |= OPT_BIT_MATERNAL_ORGANISM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Hybrid#maternalOrganismId() maternalOrganismId} to maternalOrganismId.
     * @param maternalOrganismId The value for maternalOrganismId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maternalOrganismId")
    public final Builder maternalOrganismId(Optional<String> maternalOrganismId) {
      checkNotIsSet(maternalOrganismIdIsSet(), "maternalOrganismId");
      this.maternalOrganismId = maternalOrganismId.orElse(null);
      optBits |= OPT_BIT_MATERNAL_ORGANISM_ID;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSourceMaterial_Hybrid SubstanceSourceMaterial_Hybrid}.
     * @return An immutable instance of SubstanceSourceMaterial_Hybrid
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSourceMaterial_Hybrid build() {
      return new ImmutableSubstanceSourceMaterial_Hybrid(
          maternalOrganismName,
          modifierExtension,
          paternalOrganismId,
          paternalOrganismName,
          hybridType,
          id,
          extension,
          maternalOrganismId);
    }

    private boolean maternalOrganismNameIsSet() {
      return (optBits & OPT_BIT_MATERNAL_ORGANISM_NAME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean paternalOrganismIdIsSet() {
      return (optBits & OPT_BIT_PATERNAL_ORGANISM_ID) != 0;
    }

    private boolean paternalOrganismNameIsSet() {
      return (optBits & OPT_BIT_PATERNAL_ORGANISM_NAME) != 0;
    }

    private boolean hybridTypeIsSet() {
      return (optBits & OPT_BIT_HYBRID_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean maternalOrganismIdIsSet() {
      return (optBits & OPT_BIT_MATERNAL_ORGANISM_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSourceMaterial_Hybrid is strict, attribute is already set: ".concat(name));
    }
  }
}
