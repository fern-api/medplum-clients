package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Meta}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeta.builder()}.
 */
@Generated(from = "Meta", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeta implements Meta {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Canonical> profile;
  private final @Nullable Id versionId;
  private final @Nullable Uri source;
  private final @Nullable Instant lastUpdated;
  private final @Nullable Reference author;
  private final @Nullable String id;
  private final @Nullable List<Coding> security;
  private final @Nullable List<Coding> tag;
  private final @Nullable Uri project;

  private ImmutableMeta(
      @Nullable List<Extension> extension,
      @Nullable List<Canonical> profile,
      @Nullable Id versionId,
      @Nullable Uri source,
      @Nullable Instant lastUpdated,
      @Nullable Reference author,
      @Nullable String id,
      @Nullable List<Coding> security,
      @Nullable List<Coding> tag,
      @Nullable Uri project) {
    this.extension = extension;
    this.profile = profile;
    this.versionId = versionId;
    this.source = source;
    this.lastUpdated = lastUpdated;
    this.author = author;
    this.id = id;
    this.security = security;
    this.tag = tag;
    this.project = project;
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
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Optional<List<Canonical>> profile() {
    return Optional.ofNullable(profile);
  }

  /**
   * @return The value of the {@code versionId} attribute
   */
  @JsonProperty("versionId")
  @Override
  public Optional<Id> versionId() {
    return Optional.ofNullable(versionId);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<Uri> source() {
    return Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code lastUpdated} attribute
   */
  @JsonProperty("lastUpdated")
  @Override
  public Optional<Instant> lastUpdated() {
    return Optional.ofNullable(lastUpdated);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code security} attribute
   */
  @JsonProperty("security")
  @Override
  public Optional<List<Coding>> security() {
    return Optional.ofNullable(security);
  }

  /**
   * @return The value of the {@code tag} attribute
   */
  @JsonProperty("tag")
  @Override
  public Optional<List<Coding>> tag() {
    return Optional.ofNullable(tag);
  }

  /**
   * @return The value of the {@code project} attribute
   */
  @JsonProperty("project")
  @Override
  public Optional<Uri> project() {
    return Optional.ofNullable(project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeta(
        newValue,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeta(
        value,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withProfile(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableMeta(
        this.extension,
        newValue,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withProfile(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableMeta(
        this.extension,
        value,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#versionId() versionId} attribute.
   * @param value The value for versionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withVersionId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "versionId");
    if (this.versionId == newValue) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        newValue,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#versionId() versionId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versionId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withVersionId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.versionId == value) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        value,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withSource(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        newValue,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withSource(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        value,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#lastUpdated() lastUpdated} attribute.
   * @param value The value for lastUpdated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withLastUpdated(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "lastUpdated");
    if (this.lastUpdated == newValue) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        newValue,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#lastUpdated() lastUpdated} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastUpdated
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withLastUpdated(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.lastUpdated == value) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        value,
        this.author,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        newValue,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        value,
        this.id,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        newValue,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        value,
        this.security,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#security() security} attribute.
   * @param value The value for security
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withSecurity(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "security");
    if (this.security == newValue) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        newValue,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#security() security} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for security
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withSecurity(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.security == value) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        value,
        this.tag,
        this.project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#tag() tag} attribute.
   * @param value The value for tag
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withTag(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "tag");
    if (this.tag == newValue) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        newValue,
        this.project);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#tag() tag} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for tag
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withTag(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.tag == value) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        value,
        this.project);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#project() project} attribute.
   * @param value The value for project
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withProject(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "project");
    if (this.project == newValue) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#project() project} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for project
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withProject(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.project == value) return this;
    return new ImmutableMeta(
        this.extension,
        this.profile,
        this.versionId,
        this.source,
        this.lastUpdated,
        this.author,
        this.id,
        this.security,
        this.tag,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeta} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeta
        && equalTo((ImmutableMeta) another);
  }

  private boolean equalTo(ImmutableMeta another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(profile, another.profile)
        && Objects.equals(versionId, another.versionId)
        && Objects.equals(source, another.source)
        && Objects.equals(lastUpdated, another.lastUpdated)
        && Objects.equals(author, another.author)
        && Objects.equals(id, another.id)
        && Objects.equals(security, another.security)
        && Objects.equals(tag, another.tag)
        && Objects.equals(project, another.project);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code profile}, {@code versionId}, {@code source}, {@code lastUpdated}, {@code author}, {@code id}, {@code security}, {@code tag}, {@code project}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(versionId);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(lastUpdated);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(security);
    h += (h << 5) + Objects.hashCode(tag);
    h += (h << 5) + Objects.hashCode(project);
    return h;
  }

  /**
   * Prints the immutable value {@code Meta} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Meta{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (profile != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (versionId != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("versionId=").append(versionId);
    }
    if (source != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (lastUpdated != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("lastUpdated=").append(lastUpdated);
    }
    if (author != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (id != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (security != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("security=").append(security);
    }
    if (tag != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("tag=").append(tag);
    }
    if (project != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("project=").append(project);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Meta", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Meta {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Canonical>> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<Id> versionId = Optional.empty();
    boolean versionIdIsSet;
    @Nullable Optional<Uri> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<Instant> lastUpdated = Optional.empty();
    boolean lastUpdatedIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Coding>> security = Optional.empty();
    boolean securityIsSet;
    @Nullable Optional<List<Coding>> tag = Optional.empty();
    boolean tagIsSet;
    @Nullable Optional<Uri> project = Optional.empty();
    boolean projectIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("profile")
    public void setProfile(Optional<List<Canonical>> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("versionId")
    public void setVersionId(Optional<Id> versionId) {
      this.versionId = versionId;
      this.versionIdIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<Uri> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("lastUpdated")
    public void setLastUpdated(Optional<Instant> lastUpdated) {
      this.lastUpdated = lastUpdated;
      this.lastUpdatedIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("security")
    public void setSecurity(Optional<List<Coding>> security) {
      this.security = security;
      this.securityIsSet = true;
    }
    @JsonProperty("tag")
    public void setTag(Optional<List<Coding>> tag) {
      this.tag = tag;
      this.tagIsSet = true;
    }
    @JsonProperty("project")
    public void setProject(Optional<Uri> project) {
      this.project = project;
      this.projectIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> versionId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> lastUpdated() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> security() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> tag() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> project() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMeta fromJson(Json json) {
    ImmutableMeta.Builder builder = ImmutableMeta.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.versionIdIsSet) {
      builder.versionId(json.versionId);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.lastUpdatedIsSet) {
      builder.lastUpdated(json.lastUpdated);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.securityIsSet) {
      builder.security(json.security);
    }
    if (json.tagIsSet) {
      builder.tag(json.tag);
    }
    if (json.projectIsSet) {
      builder.project(json.project);
    }
    return (ImmutableMeta) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Meta} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Meta instance
   */
  public static Meta copyOf(Meta instance) {
    if (instance instanceof ImmutableMeta) {
      return (ImmutableMeta) instance;
    }
    return ImmutableMeta.builder()
        .extension(instance.extension())
        .profile(instance.profile())
        .versionId(instance.versionId())
        .source(instance.source())
        .lastUpdated(instance.lastUpdated())
        .author(instance.author())
        .id(instance.id())
        .security(instance.security())
        .tag(instance.tag())
        .project(instance.project())
        .build();
  }

  /**
   * Creates a builder for {@link Meta Meta}.
   * <pre>
   * ImmutableMeta.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Meta#extension() extension}
   *    .profile(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link Meta#profile() profile}
   *    .versionId(com.fhir.types.fhir.Id) // optional {@link Meta#versionId() versionId}
   *    .source(com.fhir.types.fhir.Uri) // optional {@link Meta#source() source}
   *    .lastUpdated(com.fhir.types.fhir.Instant) // optional {@link Meta#lastUpdated() lastUpdated}
   *    .author(com.fhir.types.fhir.Reference) // optional {@link Meta#author() author}
   *    .id(String) // optional {@link Meta#id() id}
   *    .security(List&amp;lt;com.fhir.types.fhir.Coding&amp;gt;) // optional {@link Meta#security() security}
   *    .tag(List&amp;lt;com.fhir.types.fhir.Coding&amp;gt;) // optional {@link Meta#tag() tag}
   *    .project(com.fhir.types.fhir.Uri) // optional {@link Meta#project() project}
   *    .build();
   * </pre>
   * @return A new Meta builder
   */
  public static ImmutableMeta.Builder builder() {
    return new ImmutableMeta.Builder();
  }

  /**
   * Builds instances of type {@link Meta Meta}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Meta", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_PROFILE = 0x2L;
    private static final long OPT_BIT_VERSION_ID = 0x4L;
    private static final long OPT_BIT_SOURCE = 0x8L;
    private static final long OPT_BIT_LAST_UPDATED = 0x10L;
    private static final long OPT_BIT_AUTHOR = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_SECURITY = 0x80L;
    private static final long OPT_BIT_TAG = 0x100L;
    private static final long OPT_BIT_PROJECT = 0x200L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Canonical> profile;
    private @Nullable Id versionId;
    private @Nullable Uri source;
    private @Nullable Instant lastUpdated;
    private @Nullable Reference author;
    private @Nullable String id;
    private @Nullable List<Coding> security;
    private @Nullable List<Coding> tag;
    private @Nullable Uri project;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Meta#extension() extension} to extension.
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
     * Initializes the optional value {@link Meta#extension() extension} to extension.
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
     * Initializes the optional value {@link Meta#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(List<Canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Optional<? extends List<Canonical>> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#versionId() versionId} to versionId.
     * @param versionId The value for versionId
     * @return {@code this} builder for chained invocation
     */
    public final Builder versionId(Id versionId) {
      checkNotIsSet(versionIdIsSet(), "versionId");
      this.versionId = Objects.requireNonNull(versionId, "versionId");
      optBits |= OPT_BIT_VERSION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#versionId() versionId} to versionId.
     * @param versionId The value for versionId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("versionId")
    public final Builder versionId(Optional<? extends Id> versionId) {
      checkNotIsSet(versionIdIsSet(), "versionId");
      this.versionId = versionId.orElse(null);
      optBits |= OPT_BIT_VERSION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(Uri source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends Uri> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastUpdated(Instant lastUpdated) {
      checkNotIsSet(lastUpdatedIsSet(), "lastUpdated");
      this.lastUpdated = Objects.requireNonNull(lastUpdated, "lastUpdated");
      optBits |= OPT_BIT_LAST_UPDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdated")
    public final Builder lastUpdated(Optional<? extends Instant> lastUpdated) {
      checkNotIsSet(lastUpdatedIsSet(), "lastUpdated");
      this.lastUpdated = lastUpdated.orElse(null);
      optBits |= OPT_BIT_LAST_UPDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#id() id} to id.
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
     * Initializes the optional value {@link Meta#id() id} to id.
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
     * Initializes the optional value {@link Meta#security() security} to security.
     * @param security The value for security
     * @return {@code this} builder for chained invocation
     */
    public final Builder security(List<Coding> security) {
      checkNotIsSet(securityIsSet(), "security");
      this.security = Objects.requireNonNull(security, "security");
      optBits |= OPT_BIT_SECURITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#security() security} to security.
     * @param security The value for security
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("security")
    public final Builder security(Optional<? extends List<Coding>> security) {
      checkNotIsSet(securityIsSet(), "security");
      this.security = security.orElse(null);
      optBits |= OPT_BIT_SECURITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#tag() tag} to tag.
     * @param tag The value for tag
     * @return {@code this} builder for chained invocation
     */
    public final Builder tag(List<Coding> tag) {
      checkNotIsSet(tagIsSet(), "tag");
      this.tag = Objects.requireNonNull(tag, "tag");
      optBits |= OPT_BIT_TAG;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#tag() tag} to tag.
     * @param tag The value for tag
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("tag")
    public final Builder tag(Optional<? extends List<Coding>> tag) {
      checkNotIsSet(tagIsSet(), "tag");
      this.tag = tag.orElse(null);
      optBits |= OPT_BIT_TAG;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#project() project} to project.
     * @param project The value for project
     * @return {@code this} builder for chained invocation
     */
    public final Builder project(Uri project) {
      checkNotIsSet(projectIsSet(), "project");
      this.project = Objects.requireNonNull(project, "project");
      optBits |= OPT_BIT_PROJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#project() project} to project.
     * @param project The value for project
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("project")
    public final Builder project(Optional<? extends Uri> project) {
      checkNotIsSet(projectIsSet(), "project");
      this.project = project.orElse(null);
      optBits |= OPT_BIT_PROJECT;
      return this;
    }

    /**
     * Builds a new {@link Meta Meta}.
     * @return An immutable instance of Meta
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Meta build() {
      return new ImmutableMeta(extension, profile, versionId, source, lastUpdated, author, id, security, tag, project);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean versionIdIsSet() {
      return (optBits & OPT_BIT_VERSION_ID) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean lastUpdatedIsSet() {
      return (optBits & OPT_BIT_LAST_UPDATED) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean securityIsSet() {
      return (optBits & OPT_BIT_SECURITY) != 0;
    }

    private boolean tagIsSet() {
      return (optBits & OPT_BIT_TAG) != 0;
    }

    private boolean projectIsSet() {
      return (optBits & OPT_BIT_PROJECT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Meta is strict, attribute is already set: ".concat(name));
    }
  }
}
