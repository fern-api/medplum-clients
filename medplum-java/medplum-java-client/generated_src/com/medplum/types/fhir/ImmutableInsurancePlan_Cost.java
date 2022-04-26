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
 * Immutable implementation of {@link InsurancePlan_Cost}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan_Cost.builder()}.
 */
@Generated(from = "InsurancePlan_Cost", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan_Cost implements InsurancePlan_Cost {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final CodeableConcept type;
  private final @Nullable List<CodeableConcept> qualifiers;
  private final @Nullable CodeableConcept applicability;
  private final @Nullable Quantity value;

  private ImmutableInsurancePlan_Cost(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      CodeableConcept type,
      @Nullable List<CodeableConcept> qualifiers,
      @Nullable CodeableConcept applicability,
      @Nullable Quantity value) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.type = type;
    this.qualifiers = qualifiers;
    this.applicability = applicability;
    this.value = value;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code qualifiers} attribute
   */
  @JsonProperty("qualifiers")
  @Override
  public Optional<List<CodeableConcept>> qualifiers() {
    return Optional.ofNullable(qualifiers);
  }

  /**
   * @return The value of the {@code applicability} attribute
   */
  @JsonProperty("applicability")
  @Override
  public Optional<CodeableConcept> applicability() {
    return Optional.ofNullable(applicability);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<Quantity> value() {
    return Optional.ofNullable(value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Cost#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Cost withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan_Cost(newValue, this.extension, this.id, this.type, this.qualifiers, this.applicability, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Cost#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Cost withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan_Cost(value, this.extension, this.id, this.type, this.qualifiers, this.applicability, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Cost#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Cost withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        newValue,
        this.id,
        this.type,
        this.qualifiers,
        this.applicability,
        this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Cost#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Cost withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        value,
        this.id,
        this.type,
        this.qualifiers,
        this.applicability,
        this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Cost#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Cost withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        this.extension,
        newValue,
        this.type,
        this.qualifiers,
        this.applicability,
        this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Cost#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Cost withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        this.extension,
        value,
        this.type,
        this.qualifiers,
        this.applicability,
        this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InsurancePlan_Cost#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInsurancePlan_Cost withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        this.extension,
        this.id,
        newValue,
        this.qualifiers,
        this.applicability,
        this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Cost#qualifiers() qualifiers} attribute.
   * @param value The value for qualifiers
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Cost withQualifiers(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "qualifiers");
    if (this.qualifiers == newValue) return this;
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        this.extension,
        this.id,
        this.type,
        newValue,
        this.applicability,
        this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Cost#qualifiers() qualifiers} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualifiers
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Cost withQualifiers(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.qualifiers == value) return this;
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        this.extension,
        this.id,
        this.type,
        value,
        this.applicability,
        this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Cost#applicability() applicability} attribute.
   * @param value The value for applicability
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Cost withApplicability(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "applicability");
    if (this.applicability == newValue) return this;
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        this.extension,
        this.id,
        this.type,
        this.qualifiers,
        newValue,
        this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Cost#applicability() applicability} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for applicability
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Cost withApplicability(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.applicability == value) return this;
    return new ImmutableInsurancePlan_Cost(this.modifierExtension, this.extension, this.id, this.type, this.qualifiers, value, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Cost#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Cost withValue(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        this.extension,
        this.id,
        this.type,
        this.qualifiers,
        this.applicability,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Cost#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Cost withValue(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableInsurancePlan_Cost(
        this.modifierExtension,
        this.extension,
        this.id,
        this.type,
        this.qualifiers,
        this.applicability,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan_Cost} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan_Cost
        && equalTo((ImmutableInsurancePlan_Cost) another);
  }

  private boolean equalTo(ImmutableInsurancePlan_Cost another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && type.equals(another.type)
        && Objects.equals(qualifiers, another.qualifiers)
        && Objects.equals(applicability, another.applicability)
        && Objects.equals(value, another.value);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code id}, {@code type}, {@code qualifiers}, {@code applicability}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(qualifiers);
    h += (h << 5) + Objects.hashCode(applicability);
    h += (h << 5) + Objects.hashCode(value);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan_Cost} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("InsurancePlan_Cost{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("type=").append(type);
    if (qualifiers != null) {
      builder.append(", ");
      builder.append("qualifiers=").append(qualifiers);
    }
    if (applicability != null) {
      builder.append(", ");
      builder.append("applicability=").append(applicability);
    }
    if (value != null) {
      builder.append(", ");
      builder.append("value=").append(value);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "InsurancePlan_Cost", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InsurancePlan_Cost {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<List<CodeableConcept>> qualifiers = Optional.empty();
    boolean qualifiersIsSet;
    @Nullable Optional<CodeableConcept> applicability = Optional.empty();
    boolean applicabilityIsSet;
    @Nullable Optional<Quantity> value = Optional.empty();
    boolean valueIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("qualifiers")
    public void setQualifiers(Optional<List<CodeableConcept>> qualifiers) {
      this.qualifiers = qualifiers;
      this.qualifiersIsSet = true;
    }
    @JsonProperty("applicability")
    public void setApplicability(Optional<CodeableConcept> applicability) {
      this.applicability = applicability;
      this.applicabilityIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<Quantity> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> qualifiers() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> applicability() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInsurancePlan_Cost fromJson(Json json) {
    ImmutableInsurancePlan_Cost.Builder builder = ((ImmutableInsurancePlan_Cost.Builder) ImmutableInsurancePlan_Cost.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.qualifiersIsSet) {
      builder.qualifiers(json.qualifiers);
    }
    if (json.applicabilityIsSet) {
      builder.applicability(json.applicability);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    return (ImmutableInsurancePlan_Cost) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InsurancePlan_Cost} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InsurancePlan_Cost instance
   */
  public static InsurancePlan_Cost copyOf(InsurancePlan_Cost instance) {
    if (instance instanceof ImmutableInsurancePlan_Cost) {
      return (ImmutableInsurancePlan_Cost) instance;
    }
    return ((ImmutableInsurancePlan_Cost.Builder) ImmutableInsurancePlan_Cost.builder())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .type(instance.type())
        .qualifiers(instance.qualifiers())
        .applicability(instance.applicability())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan_Cost InsurancePlan_Cost}.
   * <pre>
   * ImmutableInsurancePlan_Cost.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Cost#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Cost#extension() extension}
   *    .id(String) // optional {@link InsurancePlan_Cost#id() id}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link InsurancePlan_Cost#type() type}
   *    .qualifiers(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link InsurancePlan_Cost#qualifiers() qualifiers}
   *    .applicability(com.medplum.types.fhir.CodeableConcept) // optional {@link InsurancePlan_Cost#applicability() applicability}
   *    .value(com.medplum.types.fhir.Quantity) // optional {@link InsurancePlan_Cost#value() value}
   *    .build();
   * </pre>
   * @return A new InsurancePlan_Cost builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableInsurancePlan_Cost.Builder();
  }

  /**
   * Builds instances of type {@link InsurancePlan_Cost InsurancePlan_Cost}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InsurancePlan_Cost", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_QUALIFIERS = 0x8L;
    private static final long OPT_BIT_APPLICABILITY = 0x10L;
    private static final long OPT_BIT_VALUE = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable List<CodeableConcept> qualifiers;
    private @Nullable CodeableConcept applicability;
    private @Nullable Quantity value;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Cost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Cost#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Cost#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Cost#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Cost#id() id} to id.
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
     * Initializes the value for the {@link InsurancePlan_Cost#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#qualifiers() qualifiers} to qualifiers.
     * @param qualifiers The value for qualifiers
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualifiers(List<CodeableConcept> qualifiers) {
      checkNotIsSet(qualifiersIsSet(), "qualifiers");
      this.qualifiers = Objects.requireNonNull(qualifiers, "qualifiers");
      optBits |= OPT_BIT_QUALIFIERS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#qualifiers() qualifiers} to qualifiers.
     * @param qualifiers The value for qualifiers
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("qualifiers")
    public final Builder qualifiers(Optional<? extends List<CodeableConcept>> qualifiers) {
      checkNotIsSet(qualifiersIsSet(), "qualifiers");
      this.qualifiers = qualifiers.orElse(null);
      optBits |= OPT_BIT_QUALIFIERS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for chained invocation
     */
    public final Builder applicability(CodeableConcept applicability) {
      checkNotIsSet(applicabilityIsSet(), "applicability");
      this.applicability = Objects.requireNonNull(applicability, "applicability");
      optBits |= OPT_BIT_APPLICABILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicability")
    public final Builder applicability(Optional<? extends CodeableConcept> applicability) {
      checkNotIsSet(applicabilityIsSet(), "applicability");
      this.applicability = applicability.orElse(null);
      optBits |= OPT_BIT_APPLICABILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(Quantity value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<? extends Quantity> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link InsurancePlan_Cost InsurancePlan_Cost}.
     * @return An immutable instance of InsurancePlan_Cost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public InsurancePlan_Cost build() {
      checkRequiredAttributes();
      return new ImmutableInsurancePlan_Cost(modifierExtension, extension, id, type, qualifiers, applicability, value);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean qualifiersIsSet() {
      return (optBits & OPT_BIT_QUALIFIERS) != 0;
    }

    private boolean applicabilityIsSet() {
      return (optBits & OPT_BIT_APPLICABILITY) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of InsurancePlan_Cost is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build InsurancePlan_Cost, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "InsurancePlan_Cost", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link InsurancePlan_Cost#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "InsurancePlan_Cost", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#qualifiers() qualifiers} to qualifiers.
     * @param qualifiers The value for qualifiers
     * @return {@code this} builder for chained invocation
     */
    BuildFinal qualifiers(List<CodeableConcept> qualifiers);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#qualifiers() qualifiers} to qualifiers.
     * @param qualifiers The value for qualifiers
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal qualifiers(Optional<? extends List<CodeableConcept>> qualifiers);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for chained invocation
     */
    BuildFinal applicability(CodeableConcept applicability);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal applicability(Optional<? extends CodeableConcept> applicability);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    BuildFinal value(Quantity value);

    /**
     * Initializes the optional value {@link InsurancePlan_Cost#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(Optional<? extends Quantity> value);

    /**
     * Builds a new {@link InsurancePlan_Cost InsurancePlan_Cost}.
     * @return An immutable instance of InsurancePlan_Cost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    InsurancePlan_Cost build();
  }
}
