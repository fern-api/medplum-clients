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
 * Immutable implementation of {@link Claim_CareTeam}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_CareTeam.builder()}.
 */
@Generated(from = "Claim_CareTeam", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_CareTeam implements Claim_CareTeam {
  private final @Nullable PositiveInt sequence;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean responsible;
  private final @Nullable CodeableConcept role;
  private final @Nullable CodeableConcept qualification;
  private final Reference provider;

  private ImmutableClaim_CareTeam(
      @Nullable PositiveInt sequence,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean responsible,
      @Nullable CodeableConcept role,
      @Nullable CodeableConcept qualification,
      Reference provider) {
    this.sequence = sequence;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.responsible = responsible;
    this.role = role;
    this.qualification = qualification;
    this.provider = provider;
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
   * @return The value of the {@code responsible} attribute
   */
  @JsonProperty("responsible")
  @Override
  public Optional<Boolean> responsible() {
    return Optional.ofNullable(responsible);
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
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Reference provider() {
    return provider;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableClaim_CareTeam(
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.responsible,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableClaim_CareTeam(
        value,
        this.id,
        this.extension,
        this.modifierExtension,
        this.responsible,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        newValue,
        this.extension,
        this.modifierExtension,
        this.responsible,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        value,
        this.extension,
        this.modifierExtension,
        this.responsible,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        newValue,
        this.modifierExtension,
        this.responsible,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        value,
        this.modifierExtension,
        this.responsible,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        this.extension,
        newValue,
        this.responsible,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        this.extension,
        value,
        this.responsible,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withResponsible(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.responsible, newValue)) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        this.extension,
        this.modifierExtension,
        newValue,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#responsible() responsible} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withResponsible(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.responsible, value)) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        this.extension,
        this.modifierExtension,
        value,
        this.role,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withRole(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        this.extension,
        this.modifierExtension,
        this.responsible,
        newValue,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withRole(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        this.extension,
        this.modifierExtension,
        this.responsible,
        value,
        this.qualification,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#qualification() qualification} attribute.
   * @param value The value for qualification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withQualification(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "qualification");
    if (this.qualification == newValue) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        this.extension,
        this.modifierExtension,
        this.responsible,
        this.role,
        newValue,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#qualification() qualification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withQualification(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.qualification == value) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        this.extension,
        this.modifierExtension,
        this.responsible,
        this.role,
        value,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim_CareTeam#provider() provider} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provider
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim_CareTeam withProvider(Reference value) {
    if (this.provider == value) return this;
    Reference newValue = Objects.requireNonNull(value, "provider");
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.id,
        this.extension,
        this.modifierExtension,
        this.responsible,
        this.role,
        this.qualification,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_CareTeam} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_CareTeam
        && equalTo((ImmutableClaim_CareTeam) another);
  }

  private boolean equalTo(ImmutableClaim_CareTeam another) {
    return Objects.equals(sequence, another.sequence)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(responsible, another.responsible)
        && Objects.equals(role, another.role)
        && Objects.equals(qualification, another.qualification)
        && provider.equals(another.provider);
  }

  /**
   * Computes a hash code from attributes: {@code sequence}, {@code id}, {@code extension}, {@code modifierExtension}, {@code responsible}, {@code role}, {@code qualification}, {@code provider}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(responsible);
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(qualification);
    h += (h << 5) + provider.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_CareTeam} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Claim_CareTeam{");
    if (sequence != null) {
      builder.append("sequence=").append(sequence);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (responsible != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("responsible=").append(responsible);
    }
    if (role != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("role=").append(role);
    }
    if (qualification != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("qualification=").append(qualification);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("provider=").append(provider);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Claim_CareTeam", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Claim_CareTeam {
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> responsible = Optional.empty();
    boolean responsibleIsSet;
    @Nullable Optional<CodeableConcept> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<CodeableConcept> qualification = Optional.empty();
    boolean qualificationIsSet;
    @Nullable Reference provider;
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
    @JsonProperty("responsible")
    public void setResponsible(Optional<Boolean> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
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
    @JsonProperty("provider")
    public void setProvider(Reference provider) {
      this.provider = provider;
    }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> responsible() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> qualification() { throw new UnsupportedOperationException(); }
    @Override
    public Reference provider() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaim_CareTeam fromJson(Json json) {
    ImmutableClaim_CareTeam.Builder builder = ((ImmutableClaim_CareTeam.Builder) ImmutableClaim_CareTeam.builder());
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.qualificationIsSet) {
      builder.qualification(json.qualification);
    }
    if (json.provider != null) {
      builder.provider(json.provider);
    }
    return (ImmutableClaim_CareTeam) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim_CareTeam} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim_CareTeam instance
   */
  public static Claim_CareTeam copyOf(Claim_CareTeam instance) {
    if (instance instanceof ImmutableClaim_CareTeam) {
      return (ImmutableClaim_CareTeam) instance;
    }
    return ((ImmutableClaim_CareTeam.Builder) ImmutableClaim_CareTeam.builder())
        .sequence(instance.sequence())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .responsible(instance.responsible())
        .role(instance.role())
        .qualification(instance.qualification())
        .provider(instance.provider())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_CareTeam Claim_CareTeam}.
   * <pre>
   * ImmutableClaim_CareTeam.builder()
   *    .sequence(com.fhir.types.fhir.PositiveInt) // optional {@link Claim_CareTeam#sequence() sequence}
   *    .id(String) // optional {@link Claim_CareTeam#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Claim_CareTeam#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Claim_CareTeam#modifierExtension() modifierExtension}
   *    .responsible(Boolean) // optional {@link Claim_CareTeam#responsible() responsible}
   *    .role(com.fhir.types.fhir.CodeableConcept) // optional {@link Claim_CareTeam#role() role}
   *    .qualification(com.fhir.types.fhir.CodeableConcept) // optional {@link Claim_CareTeam#qualification() qualification}
   *    .provider(com.fhir.types.fhir.Reference) // required {@link Claim_CareTeam#provider() provider}
   *    .build();
   * </pre>
   * @return A new Claim_CareTeam builder
   */
  public static ProviderBuildStage builder() {
    return new ImmutableClaim_CareTeam.Builder();
  }

  /**
   * Builds instances of type {@link Claim_CareTeam Claim_CareTeam}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Claim_CareTeam", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProviderBuildStage, BuildFinal {
    private static final long INIT_BIT_PROVIDER = 0x1L;
    private static final long OPT_BIT_SEQUENCE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_RESPONSIBLE = 0x10L;
    private static final long OPT_BIT_ROLE = 0x20L;
    private static final long OPT_BIT_QUALIFICATION = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable PositiveInt sequence;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean responsible;
    private @Nullable CodeableConcept role;
    private @Nullable CodeableConcept qualification;
    private @Nullable Reference provider;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link Claim_CareTeam#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link Claim_CareTeam#id() id} to id.
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
     * Initializes the optional value {@link Claim_CareTeam#id() id} to id.
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
     * Initializes the optional value {@link Claim_CareTeam#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_CareTeam#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_CareTeam#responsible() responsible} to responsible.
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
     * Initializes the optional value {@link Claim_CareTeam#responsible() responsible} to responsible.
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
     * Initializes the optional value {@link Claim_CareTeam#role() role} to role.
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
     * Initializes the optional value {@link Claim_CareTeam#role() role} to role.
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
     * Initializes the optional value {@link Claim_CareTeam#qualification() qualification} to qualification.
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
     * Initializes the optional value {@link Claim_CareTeam#qualification() qualification} to qualification.
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
     * Initializes the value for the {@link Claim_CareTeam#provider() provider} attribute.
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
     * Builds a new {@link Claim_CareTeam Claim_CareTeam}.
     * @return An immutable instance of Claim_CareTeam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Claim_CareTeam build() {
      checkRequiredAttributes();
      return new ImmutableClaim_CareTeam(sequence, id, extension, modifierExtension, responsible, role, qualification, provider);
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean qualificationIsSet() {
      return (optBits & OPT_BIT_QUALIFICATION) != 0;
    }

    private boolean providerIsSet() {
      return (initBits & INIT_BIT_PROVIDER) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Claim_CareTeam is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!providerIsSet()) attributes.add("provider");
      return "Cannot build Claim_CareTeam, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Claim_CareTeam", generator = "Immutables")
  public interface ProviderBuildStage {
    /**
     * Initializes the value for the {@link Claim_CareTeam#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(Reference provider);
  }

  @Generated(from = "Claim_CareTeam", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link Claim_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

    /**
     * Initializes the optional value {@link Claim_CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Claim_CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Claim_CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Claim_CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Claim_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_CareTeam#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responsible(boolean responsible);

    /**
     * Initializes the optional value {@link Claim_CareTeam#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responsible(Optional<Boolean> responsible);

    /**
     * Initializes the optional value {@link Claim_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    BuildFinal role(CodeableConcept role);

    /**
     * Initializes the optional value {@link Claim_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(Optional<? extends CodeableConcept> role);

    /**
     * Initializes the optional value {@link Claim_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal qualification(CodeableConcept qualification);

    /**
     * Initializes the optional value {@link Claim_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal qualification(Optional<? extends CodeableConcept> qualification);

    /**
     * Builds a new {@link Claim_CareTeam Claim_CareTeam}.
     * @return An immutable instance of Claim_CareTeam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim_CareTeam build();
  }
}
