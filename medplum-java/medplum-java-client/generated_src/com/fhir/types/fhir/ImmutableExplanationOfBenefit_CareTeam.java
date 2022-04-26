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
 * Immutable implementation of {@link ExplanationOfBenefit_CareTeam}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_CareTeam.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_CareTeam", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_CareTeam
    implements ExplanationOfBenefit_CareTeam {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final Reference provider;
  private final @Nullable CodeableConcept role;
  private final @Nullable CodeableConcept qualification;
  private final @Nullable PositiveInt sequence;
  private final @Nullable String id;
  private final @Nullable Boolean responsible;

  private ImmutableExplanationOfBenefit_CareTeam(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      Reference provider,
      @Nullable CodeableConcept role,
      @Nullable CodeableConcept qualification,
      @Nullable PositiveInt sequence,
      @Nullable String id,
      @Nullable Boolean responsible) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.provider = provider;
    this.role = role;
    this.qualification = qualification;
    this.sequence = sequence;
    this.id = id;
    this.responsible = responsible;
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
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Reference provider() {
    return provider;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<CodeableConcept> role() {
    return Optional.ofNullable(role);
  }

  /**
   * @return The value of the {@code qualification} attribute
   */
  @JsonProperty("qualification")
  @Override
  public Optional<CodeableConcept> qualification() {
    return Optional.ofNullable(qualification);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<PositiveInt> sequence() {
    return Optional.ofNullable(sequence);
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
   * @return The value of the {@code responsible} attribute
   */
  @JsonProperty("responsible")
  @Override
  public Optional<Boolean> responsible() {
    return Optional.ofNullable(responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_CareTeam#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        newValue,
        this.modifierExtension,
        this.provider,
        this.role,
        this.qualification,
        this.sequence,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_CareTeam#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_CareTeam withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        value,
        this.modifierExtension,
        this.provider,
        this.role,
        this.qualification,
        this.sequence,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_CareTeam#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        newValue,
        this.provider,
        this.role,
        this.qualification,
        this.sequence,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_CareTeam#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_CareTeam withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        value,
        this.provider,
        this.role,
        this.qualification,
        this.sequence,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_CareTeam#provider() provider} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provider
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withProvider(Reference value) {
    if (this.provider == value) return this;
    Reference newValue = Objects.requireNonNull(value, "provider");
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        newValue,
        this.role,
        this.qualification,
        this.sequence,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_CareTeam#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withRole(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        newValue,
        this.qualification,
        this.sequence,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_CareTeam#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_CareTeam withRole(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        value,
        this.qualification,
        this.sequence,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_CareTeam#qualification() qualification} attribute.
   * @param value The value for qualification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withQualification(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "qualification");
    if (this.qualification == newValue) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        this.role,
        newValue,
        this.sequence,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_CareTeam#qualification() qualification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_CareTeam withQualification(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.qualification == value) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        this.role,
        value,
        this.sequence,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_CareTeam#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        this.role,
        this.qualification,
        newValue,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_CareTeam#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_CareTeam withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        this.role,
        this.qualification,
        value,
        this.id,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_CareTeam#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        this.role,
        this.qualification,
        this.sequence,
        newValue,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_CareTeam#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        this.role,
        this.qualification,
        this.sequence,
        value,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_CareTeam#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withResponsible(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.responsible, newValue)) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        this.role,
        this.qualification,
        this.sequence,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_CareTeam#responsible() responsible} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_CareTeam withResponsible(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.responsible, value)) return this;
    return new ImmutableExplanationOfBenefit_CareTeam(
        this.extension,
        this.modifierExtension,
        this.provider,
        this.role,
        this.qualification,
        this.sequence,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_CareTeam} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_CareTeam
        && equalTo((ImmutableExplanationOfBenefit_CareTeam) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_CareTeam another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && provider.equals(another.provider)
        && Objects.equals(role, another.role)
        && Objects.equals(qualification, another.qualification)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(id, another.id)
        && Objects.equals(responsible, another.responsible);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code provider}, {@code role}, {@code qualification}, {@code sequence}, {@code id}, {@code responsible}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + provider.hashCode();
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(qualification);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(responsible);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_CareTeam} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_CareTeam{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("provider=").append(provider);
    if (role != null) {
      builder.append(", ");
      builder.append("role=").append(role);
    }
    if (qualification != null) {
      builder.append(", ");
      builder.append("qualification=").append(qualification);
    }
    if (sequence != null) {
      builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (responsible != null) {
      builder.append(", ");
      builder.append("responsible=").append(responsible);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_CareTeam", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_CareTeam {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Reference provider;
    @Nullable Optional<CodeableConcept> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<CodeableConcept> qualification = Optional.empty();
    boolean qualificationIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Boolean> responsible = Optional.empty();
    boolean responsibleIsSet;
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
    @JsonProperty("provider")
    public void setProvider(Reference provider) {
      this.provider = provider;
    }
    @JsonProperty("role")
    public void setRole(Optional<CodeableConcept> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @JsonProperty("qualification")
    public void setQualification(Optional<CodeableConcept> qualification) {
      this.qualification = qualification;
      this.qualificationIsSet = true;
    }
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("responsible")
    public void setResponsible(Optional<Boolean> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> qualification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> responsible() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_CareTeam fromJson(Json json) {
    ImmutableExplanationOfBenefit_CareTeam.Builder builder = ((ImmutableExplanationOfBenefit_CareTeam.Builder) ImmutableExplanationOfBenefit_CareTeam.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.provider != null) {
      builder.provider(json.provider);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.qualificationIsSet) {
      builder.qualification(json.qualification);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    return (ImmutableExplanationOfBenefit_CareTeam) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_CareTeam} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_CareTeam instance
   */
  public static ExplanationOfBenefit_CareTeam copyOf(ExplanationOfBenefit_CareTeam instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_CareTeam) {
      return (ImmutableExplanationOfBenefit_CareTeam) instance;
    }
    return ((ImmutableExplanationOfBenefit_CareTeam.Builder) ImmutableExplanationOfBenefit_CareTeam.builder())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .provider(instance.provider())
        .role(instance.role())
        .qualification(instance.qualification())
        .sequence(instance.sequence())
        .id(instance.id())
        .responsible(instance.responsible())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_CareTeam ExplanationOfBenefit_CareTeam}.
   * <pre>
   * ImmutableExplanationOfBenefit_CareTeam.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_CareTeam#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_CareTeam#modifierExtension() modifierExtension}
   *    .provider(com.fhir.types.fhir.Reference) // required {@link ExplanationOfBenefit_CareTeam#provider() provider}
   *    .role(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_CareTeam#role() role}
   *    .qualification(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_CareTeam#qualification() qualification}
   *    .sequence(com.fhir.types.fhir.PositiveInt) // optional {@link ExplanationOfBenefit_CareTeam#sequence() sequence}
   *    .id(String) // optional {@link ExplanationOfBenefit_CareTeam#id() id}
   *    .responsible(Boolean) // optional {@link ExplanationOfBenefit_CareTeam#responsible() responsible}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_CareTeam builder
   */
  public static ProviderBuildStage builder() {
    return new ImmutableExplanationOfBenefit_CareTeam.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_CareTeam ExplanationOfBenefit_CareTeam}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_CareTeam", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProviderBuildStage, BuildFinal {
    private static final long INIT_BIT_PROVIDER = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ROLE = 0x4L;
    private static final long OPT_BIT_QUALIFICATION = 0x8L;
    private static final long OPT_BIT_SEQUENCE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_RESPONSIBLE = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference provider;
    private @Nullable CodeableConcept role;
    private @Nullable CodeableConcept qualification;
    private @Nullable PositiveInt sequence;
    private @Nullable String id;
    private @Nullable Boolean responsible;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link ExplanationOfBenefit_CareTeam#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provider")
    public final Builder provider(Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = Objects.requireNonNull(provider, "provider");
      initBits &= ~INIT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualification(CodeableConcept qualification) {
      checkNotIsSet(qualificationIsSet(), "qualification");
      this.qualification = Objects.requireNonNull(qualification, "qualification");
      optBits |= OPT_BIT_QUALIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("qualification")
    public final Builder qualification(Optional<? extends CodeableConcept> qualification) {
      checkNotIsSet(qualificationIsSet(), "qualification");
      this.qualification = qualification.orElse(null);
      optBits |= OPT_BIT_QUALIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(PositiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<? extends PositiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    public final Builder responsible(boolean responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = responsible;
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("responsible")
    public final Builder responsible(Optional<Boolean> responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = responsible.orElse(null);
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Builds a new {@link ExplanationOfBenefit_CareTeam ExplanationOfBenefit_CareTeam}.
     * @return An immutable instance of ExplanationOfBenefit_CareTeam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_CareTeam build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_CareTeam(extension, modifierExtension, provider, role, qualification, sequence, id, responsible);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean qualificationIsSet() {
      return (optBits & OPT_BIT_QUALIFICATION) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean providerIsSet() {
      return (initBits & INIT_BIT_PROVIDER) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_CareTeam is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!providerIsSet()) attributes.add("provider");
      return "Cannot build ExplanationOfBenefit_CareTeam, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_CareTeam", generator = "Immutables")
  public interface ProviderBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_CareTeam#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(Reference provider);
  }

  @Generated(from = "ExplanationOfBenefit_CareTeam", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    BuildFinal role(CodeableConcept role);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(Optional<? extends CodeableConcept> role);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal qualification(CodeableConcept qualification);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal qualification(Optional<? extends CodeableConcept> qualification);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responsible(boolean responsible);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_CareTeam#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responsible(Optional<Boolean> responsible);

    /**
     * Builds a new {@link ExplanationOfBenefit_CareTeam ExplanationOfBenefit_CareTeam}.
     * @return An immutable instance of ExplanationOfBenefit_CareTeam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_CareTeam build();
  }
}
