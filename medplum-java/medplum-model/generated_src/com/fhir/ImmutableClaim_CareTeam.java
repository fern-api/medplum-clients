//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Claim_CareTeam}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_CareTeam.builder()}.
 */
@org.immutables.value.Generated(from = "Claim_CareTeam", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_CareTeam implements com.fhir.Claim_CareTeam {
  private final @javax.annotation.Nullable com.fhir.positiveInt sequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Boolean responsible;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept qualification;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept role;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final com.fhir.Reference provider;

  private ImmutableClaim_CareTeam(
      @javax.annotation.Nullable com.fhir.positiveInt sequence,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Boolean responsible,
      @javax.annotation.Nullable com.fhir.CodeableConcept qualification,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.CodeableConcept role,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      com.fhir.Reference provider) {
    this.sequence = sequence;
    this.extension = extension;
    this.responsible = responsible;
    this.qualification = qualification;
    this.id = id;
    this.role = role;
    this.modifierExtension = modifierExtension;
    this.provider = provider;
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> sequence() {
    return java.util.Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code responsible} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("responsible")
  @Override
  public java.util.Optional<java.lang.Boolean> responsible() {
    return java.util.Optional.ofNullable(responsible);
  }

  /**
   * @return The value of the {@code qualification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("qualification")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> qualification() {
    return java.util.Optional.ofNullable(qualification);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("role")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> role() {
    return java.util.Optional.ofNullable(role);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("provider")
  @Override
  public com.fhir.Reference provider() {
    return provider;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableClaim_CareTeam(
        newValue,
        this.extension,
        this.responsible,
        this.qualification,
        this.id,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableClaim_CareTeam(
        value,
        this.extension,
        this.responsible,
        this.qualification,
        this.id,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        newValue,
        this.responsible,
        this.qualification,
        this.id,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        value,
        this.responsible,
        this.qualification,
        this.id,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withResponsible(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.responsible, newValue)) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        newValue,
        this.qualification,
        this.id,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#responsible() responsible} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withResponsible(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.responsible, value)) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        value,
        this.qualification,
        this.id,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#qualification() qualification} attribute.
   * @param value The value for qualification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withQualification(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "qualification");
    if (this.qualification == newValue) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        this.responsible,
        newValue,
        this.id,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#qualification() qualification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withQualification(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.qualification == value) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        this.responsible,
        value,
        this.id,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        this.responsible,
        this.qualification,
        newValue,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        this.responsible,
        this.qualification,
        value,
        this.role,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withRole(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        this.responsible,
        this.qualification,
        this.id,
        newValue,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withRole(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        this.responsible,
        this.qualification,
        this.id,
        value,
        this.modifierExtension,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_CareTeam#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_CareTeam withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        this.responsible,
        this.qualification,
        this.id,
        this.role,
        newValue,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_CareTeam#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_CareTeam withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        this.responsible,
        this.qualification,
        this.id,
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
  public final ImmutableClaim_CareTeam withProvider(com.fhir.Reference value) {
    if (this.provider == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "provider");
    return new ImmutableClaim_CareTeam(
        this.sequence,
        this.extension,
        this.responsible,
        this.qualification,
        this.id,
        this.role,
        this.modifierExtension,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_CareTeam} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_CareTeam
        && equalTo((ImmutableClaim_CareTeam) another);
  }

  private boolean equalTo(ImmutableClaim_CareTeam another) {
    return java.util.Objects.equals(sequence, another.sequence)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(responsible, another.responsible)
        && java.util.Objects.equals(qualification, another.qualification)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(role, another.role)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && provider.equals(another.provider);
  }

  /**
   * Computes a hash code from attributes: {@code sequence}, {@code extension}, {@code responsible}, {@code qualification}, {@code id}, {@code role}, {@code modifierExtension}, {@code provider}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(sequence);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(responsible);
    h += (h << 5) + java.util.Objects.hashCode(qualification);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(role);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + provider.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_CareTeam} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Claim_CareTeam{");
    if (sequence != null) {
      builder.append("sequence=").append(sequence);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (responsible != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("responsible=").append(responsible);
    }
    if (qualification != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("qualification=").append(qualification);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (role != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("role=").append(role);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("provider=").append(provider);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Claim_CareTeam", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Claim_CareTeam {
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> sequence = java.util.Optional.empty();
    boolean sequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> responsible = java.util.Optional.empty();
    boolean responsibleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> qualification = java.util.Optional.empty();
    boolean qualificationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> role = java.util.Optional.empty();
    boolean roleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable com.fhir.Reference provider;
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public void setSequence(java.util.Optional<com.fhir.positiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("responsible")
    public void setResponsible(java.util.Optional<java.lang.Boolean> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("qualification")
    public void setQualification(java.util.Optional<com.fhir.CodeableConcept> qualification) {
      this.qualification = qualification;
      this.qualificationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    public void setRole(java.util.Optional<com.fhir.CodeableConcept> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public void setProvider(com.fhir.Reference provider) {
      this.provider = provider;
    }
    @Override
    public java.util.Optional<com.fhir.positiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> responsible() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> qualification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> role() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference provider() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClaim_CareTeam fromJson(Json json) {
    ImmutableClaim_CareTeam.Builder builder = ((ImmutableClaim_CareTeam.Builder) ImmutableClaim_CareTeam.builder());
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    if (json.qualificationIsSet) {
      builder.qualification(json.qualification);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .extension(instance.extension())
        .responsible(instance.responsible())
        .qualification(instance.qualification())
        .id(instance.id())
        .role(instance.role())
        .modifierExtension(instance.modifierExtension())
        .provider(instance.provider())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_CareTeam Claim_CareTeam}.
   * <pre>
   * ImmutableClaim_CareTeam.builder()
   *    .sequence(com.fhir.positiveInt) // optional {@link Claim_CareTeam#sequence() sequence}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_CareTeam#extension() extension}
   *    .responsible(Boolean) // optional {@link Claim_CareTeam#responsible() responsible}
   *    .qualification(com.fhir.CodeableConcept) // optional {@link Claim_CareTeam#qualification() qualification}
   *    .id(String) // optional {@link Claim_CareTeam#id() id}
   *    .role(com.fhir.CodeableConcept) // optional {@link Claim_CareTeam#role() role}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_CareTeam#modifierExtension() modifierExtension}
   *    .provider(com.fhir.Reference) // required {@link Claim_CareTeam#provider() provider}
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
  @org.immutables.value.Generated(from = "Claim_CareTeam", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ProviderBuildStage, BuildFinal {
    private static final long INIT_BIT_PROVIDER = 0x1L;
    private static final long OPT_BIT_SEQUENCE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_RESPONSIBLE = 0x4L;
    private static final long OPT_BIT_QUALIFICATION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_ROLE = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.positiveInt sequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Boolean responsible;
    private @javax.annotation.Nullable com.fhir.CodeableConcept qualification;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept role;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference provider;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(com.fhir.positiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = java.util.Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public final Builder sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
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
    @com.fasterxml.jackson.annotation.JsonProperty("responsible")
    public final Builder responsible(java.util.Optional<java.lang.Boolean> responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = responsible.orElse(null);
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualification(com.fhir.CodeableConcept qualification) {
      checkNotIsSet(qualificationIsSet(), "qualification");
      this.qualification = java.util.Objects.requireNonNull(qualification, "qualification");
      optBits |= OPT_BIT_QUALIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("qualification")
    public final Builder qualification(java.util.Optional<? extends com.fhir.CodeableConcept> qualification) {
      checkNotIsSet(qualificationIsSet(), "qualification");
      this.qualification = qualification.orElse(null);
      optBits |= OPT_BIT_QUALIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(com.fhir.CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = java.util.Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    public final Builder role(java.util.Optional<? extends com.fhir.CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the value for the {@link Claim_CareTeam#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public final Builder provider(com.fhir.Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = java.util.Objects.requireNonNull(provider, "provider");
      initBits &= ~INIT_BIT_PROVIDER;
      return this;
    }

    /**
     * Builds a new {@link Claim_CareTeam Claim_CareTeam}.
     * @return An immutable instance of Claim_CareTeam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Claim_CareTeam build() {
      checkRequiredAttributes();
      return new ImmutableClaim_CareTeam(sequence, extension, responsible, qualification, id, role, modifierExtension, provider);
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean qualificationIsSet() {
      return (optBits & OPT_BIT_QUALIFICATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean providerIsSet() {
      return (initBits & INIT_BIT_PROVIDER) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Claim_CareTeam is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!providerIsSet()) attributes.add("provider");
      return "Cannot build Claim_CareTeam, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Claim_CareTeam", generator = "Immutables")
  public interface ProviderBuildStage {
    /**
     * Initializes the value for the {@link Claim_CareTeam#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(com.fhir.Reference provider);
  }

  @org.immutables.value.Generated(from = "Claim_CareTeam", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(com.fhir.positiveInt sequence);

    /**
     * Initializes the optional value {@link Claim_CareTeam#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence);

    /**
     * Initializes the optional value {@link Claim_CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Claim_CareTeam#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

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
    BuildFinal responsible(java.util.Optional<java.lang.Boolean> responsible);

    /**
     * Initializes the optional value {@link Claim_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal qualification(com.fhir.CodeableConcept qualification);

    /**
     * Initializes the optional value {@link Claim_CareTeam#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal qualification(java.util.Optional<? extends com.fhir.CodeableConcept> qualification);

    /**
     * Initializes the optional value {@link Claim_CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link Claim_CareTeam#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link Claim_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    BuildFinal role(com.fhir.CodeableConcept role);

    /**
     * Initializes the optional value {@link Claim_CareTeam#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(java.util.Optional<? extends com.fhir.CodeableConcept> role);

    /**
     * Initializes the optional value {@link Claim_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_CareTeam#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link Claim_CareTeam Claim_CareTeam}.
     * @return An immutable instance of Claim_CareTeam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim_CareTeam build();
  }
}
