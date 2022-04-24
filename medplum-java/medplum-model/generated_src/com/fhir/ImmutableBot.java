//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Bot}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBot.builder()}.
 */
@org.immutables.value.Generated(from = "Bot", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBot implements com.fhir.Bot {
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String runtimeVersion;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Attachment photo;
  private final @javax.annotation.Nullable java.lang.Boolean runAsUser;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String code;

  private ImmutableBot(
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String runtimeVersion,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Attachment photo,
      @javax.annotation.Nullable java.lang.Boolean runAsUser,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String code) {
    this.name = name;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.runtimeVersion = runtimeVersion;
    this.description = description;
    this.meta = meta;
    this.id = id;
    this.photo = photo;
    this.runAsUser = runAsUser;
    this.language = language;
    this.code = code;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.util.Optional<java.lang.String> resourceType() {
    return java.util.Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code runtimeVersion} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
  @Override
  public java.util.Optional<java.lang.String> runtimeVersion() {
    return java.util.Optional.ofNullable(runtimeVersion);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code photo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("photo")
  @Override
  public java.util.Optional<com.fhir.Attachment> photo() {
    return java.util.Optional.ofNullable(photo);
  }

  /**
   * @return The value of the {@code runAsUser} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
  @Override
  public java.util.Optional<java.lang.Boolean> runAsUser() {
    return java.util.Optional.ofNullable(runAsUser);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<java.lang.String> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableBot(
        newValue,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableBot(
        value,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withResourceType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (java.util.Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableBot(
        this.name,
        newValue,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withResourceType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceType, value)) return this;
    return new ImmutableBot(
        this.name,
        value,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        newValue,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        value,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#runtimeVersion() runtimeVersion} attribute.
   * @param value The value for runtimeVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withRuntimeVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "runtimeVersion");
    if (java.util.Objects.equals(this.runtimeVersion, newValue)) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#runtimeVersion() runtimeVersion} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for runtimeVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withRuntimeVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.runtimeVersion, value)) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        value,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        newValue,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        value,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        newValue,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        value,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        newValue,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        value,
        this.photo,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withPhoto(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        newValue,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withPhoto(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        value,
        this.runAsUser,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#runAsUser() runAsUser} attribute.
   * @param value The value for runAsUser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withRunAsUser(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.runAsUser, newValue)) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        newValue,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#runAsUser() runAsUser} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for runAsUser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withRunAsUser(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.runAsUser, value)) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        value,
        this.language,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        newValue,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        value,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withCode(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "code");
    if (java.util.Objects.equals(this.code, newValue)) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#code() code} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withCode(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.code, value)) return this;
    return new ImmutableBot(
        this.name,
        this.resourceType,
        this.implicitRules,
        this.runtimeVersion,
        this.description,
        this.meta,
        this.id,
        this.photo,
        this.runAsUser,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBot} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBot
        && equalTo((ImmutableBot) another);
  }

  private boolean equalTo(ImmutableBot another) {
    return java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(runtimeVersion, another.runtimeVersion)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(photo, another.photo)
        && java.util.Objects.equals(runAsUser, another.runAsUser)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code resourceType}, {@code implicitRules}, {@code runtimeVersion}, {@code description}, {@code meta}, {@code id}, {@code photo}, {@code runAsUser}, {@code language}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(runtimeVersion);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(photo);
    h += (h << 5) + java.util.Objects.hashCode(runAsUser);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code Bot} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Bot{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (resourceType != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (implicitRules != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (runtimeVersion != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("runtimeVersion=").append(runtimeVersion);
    }
    if (description != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (meta != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (photo != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("photo=").append(photo);
    }
    if (runAsUser != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("runAsUser=").append(runAsUser);
    }
    if (language != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (code != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("code=").append(code);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Bot", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Bot {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> runtimeVersion = java.util.Optional.empty();
    boolean runtimeVersionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> photo = java.util.Optional.empty();
    boolean photoIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> runAsUser = java.util.Optional.empty();
    boolean runAsUserIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> code = java.util.Optional.empty();
    boolean codeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<java.lang.String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
    public void setRuntimeVersion(java.util.Optional<java.lang.String> runtimeVersion) {
      this.runtimeVersion = runtimeVersion;
      this.runtimeVersionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("photo")
    public void setPhoto(java.util.Optional<com.fhir.Attachment> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    public void setRunAsUser(java.util.Optional<java.lang.Boolean> runAsUser) {
      this.runAsUser = runAsUser;
      this.runAsUserIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.lang.String> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> runtimeVersion() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> photo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> runAsUser() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableBot fromJson(Json json) {
    ImmutableBot.Builder builder = ImmutableBot.builder();
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.runtimeVersionIsSet) {
      builder.runtimeVersion(json.runtimeVersion);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.runAsUserIsSet) {
      builder.runAsUser(json.runAsUser);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableBot) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bot} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bot instance
   */
  public static Bot copyOf(Bot instance) {
    if (instance instanceof ImmutableBot) {
      return (ImmutableBot) instance;
    }
    return ImmutableBot.builder()
        .name(instance.name())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .runtimeVersion(instance.runtimeVersion())
        .description(instance.description())
        .meta(instance.meta())
        .id(instance.id())
        .photo(instance.photo())
        .runAsUser(instance.runAsUser())
        .language(instance.language())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link Bot Bot}.
   * <pre>
   * ImmutableBot.builder()
   *    .name(String) // optional {@link Bot#name() name}
   *    .resourceType(String) // optional {@link Bot#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link Bot#implicitRules() implicitRules}
   *    .runtimeVersion(String) // optional {@link Bot#runtimeVersion() runtimeVersion}
   *    .description(String) // optional {@link Bot#description() description}
   *    .meta(com.fhir.Meta) // optional {@link Bot#meta() meta}
   *    .id(com.fhir.id) // optional {@link Bot#id() id}
   *    .photo(com.fhir.Attachment) // optional {@link Bot#photo() photo}
   *    .runAsUser(Boolean) // optional {@link Bot#runAsUser() runAsUser}
   *    .language(com.fhir.code) // optional {@link Bot#language() language}
   *    .code(String) // optional {@link Bot#code() code}
   *    .build();
   * </pre>
   * @return A new Bot builder
   */
  public static ImmutableBot.Builder builder() {
    return new ImmutableBot.Builder();
  }

  /**
   * Builds instances of type {@link Bot Bot}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Bot", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_RUNTIME_VERSION = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_PHOTO = 0x80L;
    private static final long OPT_BIT_RUN_AS_USER = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_CODE = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String runtimeVersion;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Attachment photo;
    private @javax.annotation.Nullable java.lang.Boolean runAsUser;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bot#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.util.Optional<java.lang.String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#runtimeVersion() runtimeVersion} to runtimeVersion.
     * @param runtimeVersion The value for runtimeVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder runtimeVersion(java.lang.String runtimeVersion) {
      checkNotIsSet(runtimeVersionIsSet(), "runtimeVersion");
      this.runtimeVersion = java.util.Objects.requireNonNull(runtimeVersion, "runtimeVersion");
      optBits |= OPT_BIT_RUNTIME_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#runtimeVersion() runtimeVersion} to runtimeVersion.
     * @param runtimeVersion The value for runtimeVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
    public final Builder runtimeVersion(java.util.Optional<java.lang.String> runtimeVersion) {
      checkNotIsSet(runtimeVersionIsSet(), "runtimeVersion");
      this.runtimeVersion = runtimeVersion.orElse(null);
      optBits |= OPT_BIT_RUNTIME_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    public final Builder photo(com.fhir.Attachment photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = java.util.Objects.requireNonNull(photo, "photo");
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("photo")
    public final Builder photo(java.util.Optional<? extends com.fhir.Attachment> photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = photo.orElse(null);
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#runAsUser() runAsUser} to runAsUser.
     * @param runAsUser The value for runAsUser
     * @return {@code this} builder for chained invocation
     */
    public final Builder runAsUser(boolean runAsUser) {
      checkNotIsSet(runAsUserIsSet(), "runAsUser");
      this.runAsUser = runAsUser;
      optBits |= OPT_BIT_RUN_AS_USER;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#runAsUser() runAsUser} to runAsUser.
     * @param runAsUser The value for runAsUser
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    public final Builder runAsUser(java.util.Optional<java.lang.Boolean> runAsUser) {
      checkNotIsSet(runAsUserIsSet(), "runAsUser");
      this.runAsUser = runAsUser.orElse(null);
      optBits |= OPT_BIT_RUN_AS_USER;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(java.lang.String code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<java.lang.String> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Builds a new {@link Bot Bot}.
     * @return An immutable instance of Bot
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Bot build() {
      return new ImmutableBot(
          name,
          resourceType,
          implicitRules,
          runtimeVersion,
          description,
          meta,
          id,
          photo,
          runAsUser,
          language,
          code);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean runtimeVersionIsSet() {
      return (optBits & OPT_BIT_RUNTIME_VERSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean runAsUserIsSet() {
      return (optBits & OPT_BIT_RUN_AS_USER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Bot is strict, attribute is already set: ".concat(name));
    }
  }
}
