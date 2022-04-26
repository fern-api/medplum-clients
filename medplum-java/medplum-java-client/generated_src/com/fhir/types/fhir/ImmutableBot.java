package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Bot}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBot.builder()}.
 */
@Generated(from = "Bot", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBot implements Bot {
  private final @Nullable Attachment photo;
  private final @Nullable Code language;
  private final @Nullable Uri implicitRules;
  private final @Nullable Boolean runAsUser;
  private final @Nullable String runtimeVersion;
  private final @Nullable Meta meta;
  private final @Nullable Id id;
  private final @Nullable String resourceType;
  private final @Nullable String code;
  private final @Nullable String description;
  private final @Nullable String name;

  private ImmutableBot(
      @Nullable Attachment photo,
      @Nullable Code language,
      @Nullable Uri implicitRules,
      @Nullable Boolean runAsUser,
      @Nullable String runtimeVersion,
      @Nullable Meta meta,
      @Nullable Id id,
      @Nullable String resourceType,
      @Nullable String code,
      @Nullable String description,
      @Nullable String name) {
    this.photo = photo;
    this.language = language;
    this.implicitRules = implicitRules;
    this.runAsUser = runAsUser;
    this.runtimeVersion = runtimeVersion;
    this.meta = meta;
    this.id = id;
    this.resourceType = resourceType;
    this.code = code;
    this.description = description;
    this.name = name;
  }

  /**
   * @return The value of the {@code photo} attribute
   */
  @JsonProperty("photo")
  @Override
  public Optional<Attachment> photo() {
    return Optional.ofNullable(photo);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code runAsUser} attribute
   */
  @JsonProperty("runAsUser")
  @Override
  public Optional<Boolean> runAsUser() {
    return Optional.ofNullable(runAsUser);
  }

  /**
   * @return The value of the {@code runtimeVersion} attribute
   */
  @JsonProperty("runtimeVersion")
  @Override
  public Optional<String> runtimeVersion() {
    return Optional.ofNullable(runtimeVersion);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public Optional<String> resourceType() {
    return Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<String> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withPhoto(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutableBot(
        newValue,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withPhoto(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutableBot(
        value,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBot(
        this.photo,
        newValue,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBot(
        this.photo,
        value,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        newValue,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        value,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#runAsUser() runAsUser} attribute.
   * @param value The value for runAsUser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withRunAsUser(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.runAsUser, newValue)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        newValue,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#runAsUser() runAsUser} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for runAsUser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withRunAsUser(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.runAsUser, value)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        value,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#runtimeVersion() runtimeVersion} attribute.
   * @param value The value for runtimeVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withRuntimeVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "runtimeVersion");
    if (Objects.equals(this.runtimeVersion, newValue)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        newValue,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#runtimeVersion() runtimeVersion} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for runtimeVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withRuntimeVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.runtimeVersion, value)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        value,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        newValue,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        value,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        newValue,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBot withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        value,
        this.resourceType,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        newValue,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        value,
        this.code,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "code");
    if (Objects.equals(this.code, newValue)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        newValue,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#code() code} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.code, value)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        value,
        this.description,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        newValue,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        value,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bot#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bot#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBot withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableBot(
        this.photo,
        this.language,
        this.implicitRules,
        this.runAsUser,
        this.runtimeVersion,
        this.meta,
        this.id,
        this.resourceType,
        this.code,
        this.description,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBot} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBot
        && equalTo((ImmutableBot) another);
  }

  private boolean equalTo(ImmutableBot another) {
    return Objects.equals(photo, another.photo)
        && Objects.equals(language, another.language)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(runAsUser, another.runAsUser)
        && Objects.equals(runtimeVersion, another.runtimeVersion)
        && Objects.equals(meta, another.meta)
        && Objects.equals(id, another.id)
        && Objects.equals(resourceType, another.resourceType)
        && Objects.equals(code, another.code)
        && Objects.equals(description, another.description)
        && Objects.equals(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code photo}, {@code language}, {@code implicitRules}, {@code runAsUser}, {@code runtimeVersion}, {@code meta}, {@code id}, {@code resourceType}, {@code code}, {@code description}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(photo);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(runAsUser);
    h += (h << 5) + Objects.hashCode(runtimeVersion);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code Bot} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Bot{");
    if (photo != null) {
      builder.append("photo=").append(photo);
    }
    if (language != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (implicitRules != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (runAsUser != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("runAsUser=").append(runAsUser);
    }
    if (runtimeVersion != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("runtimeVersion=").append(runtimeVersion);
    }
    if (meta != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (resourceType != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (code != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (description != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (name != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("name=").append(name);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Bot", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Bot {
    @Nullable Optional<Attachment> photo = Optional.empty();
    boolean photoIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Boolean> runAsUser = Optional.empty();
    boolean runAsUserIsSet;
    @Nullable Optional<String> runtimeVersion = Optional.empty();
    boolean runtimeVersionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<String> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @JsonProperty("photo")
    public void setPhoto(Optional<Attachment> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("runAsUser")
    public void setRunAsUser(Optional<Boolean> runAsUser) {
      this.runAsUser = runAsUser;
      this.runAsUserIsSet = true;
    }
    @JsonProperty("runtimeVersion")
    public void setRuntimeVersion(Optional<String> runtimeVersion) {
      this.runtimeVersion = runtimeVersion;
      this.runtimeVersionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<String> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @Override
    public Optional<Attachment> photo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> runAsUser() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> runtimeVersion() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBot fromJson(Json json) {
    ImmutableBot.Builder builder = ImmutableBot.builder();
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.runAsUserIsSet) {
      builder.runAsUser(json.runAsUser);
    }
    if (json.runtimeVersionIsSet) {
      builder.runtimeVersion(json.runtimeVersion);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
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
        .photo(instance.photo())
        .language(instance.language())
        .implicitRules(instance.implicitRules())
        .runAsUser(instance.runAsUser())
        .runtimeVersion(instance.runtimeVersion())
        .meta(instance.meta())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .code(instance.code())
        .description(instance.description())
        .name(instance.name())
        .build();
  }

  /**
   * Creates a builder for {@link Bot Bot}.
   * <pre>
   * ImmutableBot.builder()
   *    .photo(com.fhir.types.fhir.Attachment) // optional {@link Bot#photo() photo}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Bot#language() language}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Bot#implicitRules() implicitRules}
   *    .runAsUser(Boolean) // optional {@link Bot#runAsUser() runAsUser}
   *    .runtimeVersion(String) // optional {@link Bot#runtimeVersion() runtimeVersion}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Bot#meta() meta}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Bot#id() id}
   *    .resourceType(String) // optional {@link Bot#resourceType() resourceType}
   *    .code(String) // optional {@link Bot#code() code}
   *    .description(String) // optional {@link Bot#description() description}
   *    .name(String) // optional {@link Bot#name() name}
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
  @Generated(from = "Bot", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PHOTO = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_RUN_AS_USER = 0x8L;
    private static final long OPT_BIT_RUNTIME_VERSION = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x80L;
    private static final long OPT_BIT_CODE = 0x100L;
    private static final long OPT_BIT_DESCRIPTION = 0x200L;
    private static final long OPT_BIT_NAME = 0x400L;
    private long optBits;

    private @Nullable Attachment photo;
    private @Nullable Code language;
    private @Nullable Uri implicitRules;
    private @Nullable Boolean runAsUser;
    private @Nullable String runtimeVersion;
    private @Nullable Meta meta;
    private @Nullable Id id;
    private @Nullable String resourceType;
    private @Nullable String code;
    private @Nullable String description;
    private @Nullable String name;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bot#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    public final Builder photo(Attachment photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = Objects.requireNonNull(photo, "photo");
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("photo")
    public final Builder photo(Optional<? extends Attachment> photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = photo.orElse(null);
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
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
    @JsonProperty("runAsUser")
    public final Builder runAsUser(Optional<Boolean> runAsUser) {
      checkNotIsSet(runAsUserIsSet(), "runAsUser");
      this.runAsUser = runAsUser.orElse(null);
      optBits |= OPT_BIT_RUN_AS_USER;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#runtimeVersion() runtimeVersion} to runtimeVersion.
     * @param runtimeVersion The value for runtimeVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder runtimeVersion(String runtimeVersion) {
      checkNotIsSet(runtimeVersionIsSet(), "runtimeVersion");
      this.runtimeVersion = Objects.requireNonNull(runtimeVersion, "runtimeVersion");
      optBits |= OPT_BIT_RUNTIME_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#runtimeVersion() runtimeVersion} to runtimeVersion.
     * @param runtimeVersion The value for runtimeVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("runtimeVersion")
    public final Builder runtimeVersion(Optional<String> runtimeVersion) {
      checkNotIsSet(runtimeVersionIsSet(), "runtimeVersion");
      this.runtimeVersion = runtimeVersion.orElse(null);
      optBits |= OPT_BIT_RUNTIME_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
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
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(Optional<String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(String code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<String> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Bot#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Builds a new {@link Bot Bot}.
     * @return An immutable instance of Bot
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Bot build() {
      return new ImmutableBot(
          photo,
          language,
          implicitRules,
          runAsUser,
          runtimeVersion,
          meta,
          id,
          resourceType,
          code,
          description,
          name);
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean runAsUserIsSet() {
      return (optBits & OPT_BIT_RUN_AS_USER) != 0;
    }

    private boolean runtimeVersionIsSet() {
      return (optBits & OPT_BIT_RUNTIME_VERSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Bot is strict, attribute is already set: ".concat(name));
    }
  }
}
