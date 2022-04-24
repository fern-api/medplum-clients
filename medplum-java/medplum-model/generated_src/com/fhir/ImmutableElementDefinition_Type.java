//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ElementDefinition_Type}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Type.builder()}.
 */
@org.immutables.value.Generated(from = "ElementDefinition_Type", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Type implements com.fhir.ElementDefinition_Type {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.uri code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Elementdefinition_typeVersioning versioning;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Elementdefinition_typeAggregationItem> aggregation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> targetProfile;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> profile;

  private ImmutableElementDefinition_Type(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.uri code,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Elementdefinition_typeVersioning versioning,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Elementdefinition_typeAggregationItem> aggregation,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> targetProfile,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> profile) {
    this.id = id;
    this.code = code;
    this.extension = extension;
    this.versioning = versioning;
    this.modifierExtension = modifierExtension;
    this.aggregation = aggregation;
    this.targetProfile = targetProfile;
    this.profile = profile;
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.uri> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code versioning} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("versioning")
  @Override
  public java.util.Optional<com.fhir.Elementdefinition_typeVersioning> versioning() {
    return java.util.Optional.ofNullable(versioning);
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
   * @return The value of the {@code aggregation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("aggregation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Elementdefinition_typeAggregationItem>> aggregation() {
    return java.util.Optional.ofNullable(aggregation);
  }

  /**
   * @return The value of the {@code targetProfile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetProfile")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> targetProfile() {
    return java.util.Optional.ofNullable(targetProfile);
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("profile")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> profile() {
    return java.util.Optional.ofNullable(profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Type(
        newValue,
        this.code,
        this.extension,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Type(
        value,
        this.code,
        this.extension,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withCode(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        newValue,
        this.extension,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withCode(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        value,
        this.extension,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        newValue,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        value,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#versioning() versioning} attribute.
   * @param value The value for versioning
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withVersioning(com.fhir.Elementdefinition_typeVersioning value) {
    @javax.annotation.Nullable com.fhir.Elementdefinition_typeVersioning newValue = java.util.Objects.requireNonNull(value, "versioning");
    if (this.versioning == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        newValue,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#versioning() versioning} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versioning
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withVersioning(java.util.Optional<? extends com.fhir.Elementdefinition_typeVersioning> optional) {
    @javax.annotation.Nullable com.fhir.Elementdefinition_typeVersioning value = optional.orElse(null);
    if (this.versioning == value) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        value,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        this.versioning,
        newValue,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        this.versioning,
        value,
        this.aggregation,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#aggregation() aggregation} attribute.
   * @param value The value for aggregation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withAggregation(java.util.List<com.fhir.Elementdefinition_typeAggregationItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Elementdefinition_typeAggregationItem> newValue = java.util.Objects.requireNonNull(value, "aggregation");
    if (this.aggregation == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        this.versioning,
        this.modifierExtension,
        newValue,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#aggregation() aggregation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for aggregation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withAggregation(java.util.Optional<? extends java.util.List<com.fhir.Elementdefinition_typeAggregationItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Elementdefinition_typeAggregationItem> value = optional.orElse(null);
    if (this.aggregation == value) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        this.versioning,
        this.modifierExtension,
        value,
        this.targetProfile,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#targetProfile() targetProfile} attribute.
   * @param value The value for targetProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withTargetProfile(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "targetProfile");
    if (this.targetProfile == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        newValue,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#targetProfile() targetProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withTargetProfile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.targetProfile == value) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        value,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Type#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Type withProfile(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Type#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Type withProfile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableElementDefinition_Type(
        this.id,
        this.code,
        this.extension,
        this.versioning,
        this.modifierExtension,
        this.aggregation,
        this.targetProfile,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Type} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Type
        && equalTo((ImmutableElementDefinition_Type) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Type another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(versioning, another.versioning)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(aggregation, another.aggregation)
        && java.util.Objects.equals(targetProfile, another.targetProfile)
        && java.util.Objects.equals(profile, another.profile);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code code}, {@code extension}, {@code versioning}, {@code modifierExtension}, {@code aggregation}, {@code targetProfile}, {@code profile}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(versioning);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(aggregation);
    h += (h << 5) + java.util.Objects.hashCode(targetProfile);
    h += (h << 5) + java.util.Objects.hashCode(profile);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Type} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ElementDefinition_Type{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (versioning != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("versioning=").append(versioning);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (aggregation != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("aggregation=").append(aggregation);
    }
    if (targetProfile != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("targetProfile=").append(targetProfile);
    }
    if (profile != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ElementDefinition_Type", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ElementDefinition_Type {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Elementdefinition_typeVersioning> versioning = java.util.Optional.empty();
    boolean versioningIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Elementdefinition_typeAggregationItem>> aggregation = java.util.Optional.empty();
    boolean aggregationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> targetProfile = java.util.Optional.empty();
    boolean targetProfileIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> profile = java.util.Optional.empty();
    boolean profileIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.uri> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("versioning")
    public void setVersioning(java.util.Optional<com.fhir.Elementdefinition_typeVersioning> versioning) {
      this.versioning = versioning;
      this.versioningIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("aggregation")
    public void setAggregation(java.util.Optional<java.util.List<com.fhir.Elementdefinition_typeAggregationItem>> aggregation) {
      this.aggregation = aggregation;
      this.aggregationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetProfile")
    public void setTargetProfile(java.util.Optional<java.util.List<com.fhir.canonical>> targetProfile) {
      this.targetProfile = targetProfile;
      this.targetProfileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(java.util.Optional<java.util.List<com.fhir.canonical>> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Elementdefinition_typeVersioning> versioning() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Elementdefinition_typeAggregationItem>> aggregation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> targetProfile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> profile() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Type fromJson(Json json) {
    ImmutableElementDefinition_Type.Builder builder = ImmutableElementDefinition_Type.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.versioningIsSet) {
      builder.versioning(json.versioning);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.aggregationIsSet) {
      builder.aggregation(json.aggregation);
    }
    if (json.targetProfileIsSet) {
      builder.targetProfile(json.targetProfile);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    return (ImmutableElementDefinition_Type) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ElementDefinition_Type} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ElementDefinition_Type instance
   */
  public static ElementDefinition_Type copyOf(ElementDefinition_Type instance) {
    if (instance instanceof ImmutableElementDefinition_Type) {
      return (ImmutableElementDefinition_Type) instance;
    }
    return ImmutableElementDefinition_Type.builder()
        .id(instance.id())
        .code(instance.code())
        .extension(instance.extension())
        .versioning(instance.versioning())
        .modifierExtension(instance.modifierExtension())
        .aggregation(instance.aggregation())
        .targetProfile(instance.targetProfile())
        .profile(instance.profile())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Type ElementDefinition_Type}.
   * <pre>
   * ImmutableElementDefinition_Type.builder()
   *    .id(String) // optional {@link ElementDefinition_Type#id() id}
   *    .code(com.fhir.uri) // optional {@link ElementDefinition_Type#code() code}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Type#extension() extension}
   *    .versioning(com.fhir.Elementdefinition_typeVersioning) // optional {@link ElementDefinition_Type#versioning() versioning}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Type#modifierExtension() modifierExtension}
   *    .aggregation(List&amp;lt;com.fhir.Elementdefinition_typeAggregationItem&amp;gt;) // optional {@link ElementDefinition_Type#aggregation() aggregation}
   *    .targetProfile(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ElementDefinition_Type#targetProfile() targetProfile}
   *    .profile(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ElementDefinition_Type#profile() profile}
   *    .build();
   * </pre>
   * @return A new ElementDefinition_Type builder
   */
  public static ImmutableElementDefinition_Type.Builder builder() {
    return new ImmutableElementDefinition_Type.Builder();
  }

  /**
   * Builds instances of type {@link ElementDefinition_Type ElementDefinition_Type}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ElementDefinition_Type", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_VERSIONING = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_AGGREGATION = 0x20L;
    private static final long OPT_BIT_TARGET_PROFILE = 0x40L;
    private static final long OPT_BIT_PROFILE = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.uri code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Elementdefinition_typeVersioning versioning;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Elementdefinition_typeAggregationItem> aggregation;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> targetProfile;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> profile;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Type#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Type#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.uri code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.uri> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Type#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Type#versioning() versioning} to versioning.
     * @param versioning The value for versioning
     * @return {@code this} builder for chained invocation
     */
    public final Builder versioning(com.fhir.Elementdefinition_typeVersioning versioning) {
      checkNotIsSet(versioningIsSet(), "versioning");
      this.versioning = java.util.Objects.requireNonNull(versioning, "versioning");
      optBits |= OPT_BIT_VERSIONING;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#versioning() versioning} to versioning.
     * @param versioning The value for versioning
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versioning")
    public final Builder versioning(java.util.Optional<? extends com.fhir.Elementdefinition_typeVersioning> versioning) {
      checkNotIsSet(versioningIsSet(), "versioning");
      this.versioning = versioning.orElse(null);
      optBits |= OPT_BIT_VERSIONING;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Type#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Type#aggregation() aggregation} to aggregation.
     * @param aggregation The value for aggregation
     * @return {@code this} builder for chained invocation
     */
    public final Builder aggregation(java.util.List<com.fhir.Elementdefinition_typeAggregationItem> aggregation) {
      checkNotIsSet(aggregationIsSet(), "aggregation");
      this.aggregation = java.util.Objects.requireNonNull(aggregation, "aggregation");
      optBits |= OPT_BIT_AGGREGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#aggregation() aggregation} to aggregation.
     * @param aggregation The value for aggregation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregation")
    public final Builder aggregation(java.util.Optional<? extends java.util.List<com.fhir.Elementdefinition_typeAggregationItem>> aggregation) {
      checkNotIsSet(aggregationIsSet(), "aggregation");
      this.aggregation = aggregation.orElse(null);
      optBits |= OPT_BIT_AGGREGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#targetProfile() targetProfile} to targetProfile.
     * @param targetProfile The value for targetProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetProfile(java.util.List<com.fhir.canonical> targetProfile) {
      checkNotIsSet(targetProfileIsSet(), "targetProfile");
      this.targetProfile = java.util.Objects.requireNonNull(targetProfile, "targetProfile");
      optBits |= OPT_BIT_TARGET_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#targetProfile() targetProfile} to targetProfile.
     * @param targetProfile The value for targetProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetProfile")
    public final Builder targetProfile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> targetProfile) {
      checkNotIsSet(targetProfileIsSet(), "targetProfile");
      this.targetProfile = targetProfile.orElse(null);
      optBits |= OPT_BIT_TARGET_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(java.util.List<com.fhir.canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = java.util.Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Type#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public final Builder profile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Builds a new {@link ElementDefinition_Type ElementDefinition_Type}.
     * @return An immutable instance of ElementDefinition_Type
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ElementDefinition_Type build() {
      return new ImmutableElementDefinition_Type(id, code, extension, versioning, modifierExtension, aggregation, targetProfile, profile);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean versioningIsSet() {
      return (optBits & OPT_BIT_VERSIONING) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean aggregationIsSet() {
      return (optBits & OPT_BIT_AGGREGATION) != 0;
    }

    private boolean targetProfileIsSet() {
      return (optBits & OPT_BIT_TARGET_PROFILE) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ElementDefinition_Type is strict, attribute is already set: ".concat(name));
    }
  }
}
