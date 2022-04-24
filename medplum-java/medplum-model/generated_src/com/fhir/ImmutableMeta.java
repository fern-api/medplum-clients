//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Meta}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeta.builder()}.
 */
@org.immutables.value.Generated(from = "Meta", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeta implements com.fhir.Meta {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coding> tag;
  private final @javax.annotation.Nullable com.fhir.id versionId;
  private final @javax.annotation.Nullable com.fhir.uri source;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> profile;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.uri project;
  private final @javax.annotation.Nullable com.fhir.instant lastUpdated;
  private final @javax.annotation.Nullable com.fhir.Reference author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coding> security;

  private ImmutableMeta(
      @javax.annotation.Nullable java.util.List<com.fhir.Coding> tag,
      @javax.annotation.Nullable com.fhir.id versionId,
      @javax.annotation.Nullable com.fhir.uri source,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> profile,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.uri project,
      @javax.annotation.Nullable com.fhir.instant lastUpdated,
      @javax.annotation.Nullable com.fhir.Reference author,
      @javax.annotation.Nullable java.util.List<com.fhir.Coding> security) {
    this.tag = tag;
    this.versionId = versionId;
    this.source = source;
    this.profile = profile;
    this.id = id;
    this.extension = extension;
    this.project = project;
    this.lastUpdated = lastUpdated;
    this.author = author;
    this.security = security;
  }

  /**
   * @return The value of the {@code tag} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("tag")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coding>> tag() {
    return java.util.Optional.ofNullable(tag);
  }

  /**
   * @return The value of the {@code versionId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("versionId")
  @Override
  public java.util.Optional<com.fhir.id> versionId() {
    return java.util.Optional.ofNullable(versionId);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.Optional<com.fhir.uri> source() {
    return java.util.Optional.ofNullable(source);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code project} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("project")
  @Override
  public java.util.Optional<com.fhir.uri> project() {
    return java.util.Optional.ofNullable(project);
  }

  /**
   * @return The value of the {@code lastUpdated} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
  @Override
  public java.util.Optional<com.fhir.instant> lastUpdated() {
    return java.util.Optional.ofNullable(lastUpdated);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<com.fhir.Reference> author() {
    return java.util.Optional.ofNullable(author);
  }

  /**
   * @return The value of the {@code security} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("security")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coding>> security() {
    return java.util.Optional.ofNullable(security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#tag() tag} attribute.
   * @param value The value for tag
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withTag(java.util.List<com.fhir.Coding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> newValue = java.util.Objects.requireNonNull(value, "tag");
    if (this.tag == newValue) return this;
    return new ImmutableMeta(
        newValue,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#tag() tag} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for tag
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withTag(java.util.Optional<? extends java.util.List<com.fhir.Coding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> value = optional.orElse(null);
    if (this.tag == value) return this;
    return new ImmutableMeta(
        value,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#versionId() versionId} attribute.
   * @param value The value for versionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withVersionId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "versionId");
    if (this.versionId == newValue) return this;
    return new ImmutableMeta(
        this.tag,
        newValue,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#versionId() versionId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versionId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withVersionId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.versionId == value) return this;
    return new ImmutableMeta(
        this.tag,
        value,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withSource(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        newValue,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withSource(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        value,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withProfile(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        newValue,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withProfile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        value,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        newValue,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        value,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        newValue,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        value,
        this.project,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#project() project} attribute.
   * @param value The value for project
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withProject(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "project");
    if (this.project == newValue) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        newValue,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#project() project} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for project
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withProject(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.project == value) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        value,
        this.lastUpdated,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#lastUpdated() lastUpdated} attribute.
   * @param value The value for lastUpdated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withLastUpdated(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "lastUpdated");
    if (this.lastUpdated == newValue) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        newValue,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#lastUpdated() lastUpdated} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastUpdated
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withLastUpdated(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.lastUpdated == value) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        value,
        this.author,
        this.security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withAuthor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        newValue,
        this.security);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withAuthor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        value,
        this.security);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Meta#security() security} attribute.
   * @param value The value for security
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeta withSecurity(java.util.List<com.fhir.Coding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> newValue = java.util.Objects.requireNonNull(value, "security");
    if (this.security == newValue) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Meta#security() security} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for security
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeta withSecurity(java.util.Optional<? extends java.util.List<com.fhir.Coding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> value = optional.orElse(null);
    if (this.security == value) return this;
    return new ImmutableMeta(
        this.tag,
        this.versionId,
        this.source,
        this.profile,
        this.id,
        this.extension,
        this.project,
        this.lastUpdated,
        this.author,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeta} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeta
        && equalTo((ImmutableMeta) another);
  }

  private boolean equalTo(ImmutableMeta another) {
    return java.util.Objects.equals(tag, another.tag)
        && java.util.Objects.equals(versionId, another.versionId)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(profile, another.profile)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(project, another.project)
        && java.util.Objects.equals(lastUpdated, another.lastUpdated)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(security, another.security);
  }

  /**
   * Computes a hash code from attributes: {@code tag}, {@code versionId}, {@code source}, {@code profile}, {@code id}, {@code extension}, {@code project}, {@code lastUpdated}, {@code author}, {@code security}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(tag);
    h += (h << 5) + java.util.Objects.hashCode(versionId);
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(profile);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(project);
    h += (h << 5) + java.util.Objects.hashCode(lastUpdated);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(security);
    return h;
  }

  /**
   * Prints the immutable value {@code Meta} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Meta{");
    if (tag != null) {
      builder.append("tag=").append(tag);
    }
    if (versionId != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("versionId=").append(versionId);
    }
    if (source != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (profile != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (id != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (project != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("project=").append(project);
    }
    if (lastUpdated != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("lastUpdated=").append(lastUpdated);
    }
    if (author != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (security != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("security=").append(security);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Meta", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Meta {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coding>> tag = java.util.Optional.empty();
    boolean tagIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> versionId = java.util.Optional.empty();
    boolean versionIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> profile = java.util.Optional.empty();
    boolean profileIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> project = java.util.Optional.empty();
    boolean projectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> lastUpdated = java.util.Optional.empty();
    boolean lastUpdatedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coding>> security = java.util.Optional.empty();
    boolean securityIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("tag")
    public void setTag(java.util.Optional<java.util.List<com.fhir.Coding>> tag) {
      this.tag = tag;
      this.tagIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("versionId")
    public void setVersionId(java.util.Optional<com.fhir.id> versionId) {
      this.versionId = versionId;
      this.versionIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<com.fhir.uri> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(java.util.Optional<java.util.List<com.fhir.canonical>> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    public void setProject(java.util.Optional<com.fhir.uri> project) {
      this.project = project;
      this.projectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
    public void setLastUpdated(java.util.Optional<com.fhir.instant> lastUpdated) {
      this.lastUpdated = lastUpdated;
      this.lastUpdatedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<com.fhir.Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("security")
    public void setSecurity(java.util.Optional<java.util.List<com.fhir.Coding>> security) {
      this.security = security;
      this.securityIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coding>> tag() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> versionId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> profile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> project() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> lastUpdated() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coding>> security() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMeta fromJson(Json json) {
    ImmutableMeta.Builder builder = ImmutableMeta.builder();
    if (json.tagIsSet) {
      builder.tag(json.tag);
    }
    if (json.versionIdIsSet) {
      builder.versionId(json.versionId);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.projectIsSet) {
      builder.project(json.project);
    }
    if (json.lastUpdatedIsSet) {
      builder.lastUpdated(json.lastUpdated);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.securityIsSet) {
      builder.security(json.security);
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
        .tag(instance.tag())
        .versionId(instance.versionId())
        .source(instance.source())
        .profile(instance.profile())
        .id(instance.id())
        .extension(instance.extension())
        .project(instance.project())
        .lastUpdated(instance.lastUpdated())
        .author(instance.author())
        .security(instance.security())
        .build();
  }

  /**
   * Creates a builder for {@link Meta Meta}.
   * <pre>
   * ImmutableMeta.builder()
   *    .tag(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link Meta#tag() tag}
   *    .versionId(com.fhir.id) // optional {@link Meta#versionId() versionId}
   *    .source(com.fhir.uri) // optional {@link Meta#source() source}
   *    .profile(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link Meta#profile() profile}
   *    .id(String) // optional {@link Meta#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Meta#extension() extension}
   *    .project(com.fhir.uri) // optional {@link Meta#project() project}
   *    .lastUpdated(com.fhir.instant) // optional {@link Meta#lastUpdated() lastUpdated}
   *    .author(com.fhir.Reference) // optional {@link Meta#author() author}
   *    .security(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link Meta#security() security}
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
  @org.immutables.value.Generated(from = "Meta", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TAG = 0x1L;
    private static final long OPT_BIT_VERSION_ID = 0x2L;
    private static final long OPT_BIT_SOURCE = 0x4L;
    private static final long OPT_BIT_PROFILE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_PROJECT = 0x40L;
    private static final long OPT_BIT_LAST_UPDATED = 0x80L;
    private static final long OPT_BIT_AUTHOR = 0x100L;
    private static final long OPT_BIT_SECURITY = 0x200L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Coding> tag;
    private @javax.annotation.Nullable com.fhir.id versionId;
    private @javax.annotation.Nullable com.fhir.uri source;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> profile;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.uri project;
    private @javax.annotation.Nullable com.fhir.instant lastUpdated;
    private @javax.annotation.Nullable com.fhir.Reference author;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coding> security;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Meta#tag() tag} to tag.
     * @param tag The value for tag
     * @return {@code this} builder for chained invocation
     */
    public final Builder tag(java.util.List<com.fhir.Coding> tag) {
      checkNotIsSet(tagIsSet(), "tag");
      this.tag = java.util.Objects.requireNonNull(tag, "tag");
      optBits |= OPT_BIT_TAG;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#tag() tag} to tag.
     * @param tag The value for tag
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tag")
    public final Builder tag(java.util.Optional<? extends java.util.List<com.fhir.Coding>> tag) {
      checkNotIsSet(tagIsSet(), "tag");
      this.tag = tag.orElse(null);
      optBits |= OPT_BIT_TAG;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#versionId() versionId} to versionId.
     * @param versionId The value for versionId
     * @return {@code this} builder for chained invocation
     */
    public final Builder versionId(com.fhir.id versionId) {
      checkNotIsSet(versionIdIsSet(), "versionId");
      this.versionId = java.util.Objects.requireNonNull(versionId, "versionId");
      optBits |= OPT_BIT_VERSION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#versionId() versionId} to versionId.
     * @param versionId The value for versionId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versionId")
    public final Builder versionId(java.util.Optional<? extends com.fhir.id> versionId) {
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
    public final Builder source(com.fhir.uri source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(java.util.Optional<? extends com.fhir.uri> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#profile() profile} to profile.
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
     * Initializes the optional value {@link Meta#profile() profile} to profile.
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
     * Initializes the optional value {@link Meta#id() id} to id.
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
     * Initializes the optional value {@link Meta#id() id} to id.
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
     * Initializes the optional value {@link Meta#extension() extension} to extension.
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
     * Initializes the optional value {@link Meta#extension() extension} to extension.
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
     * Initializes the optional value {@link Meta#project() project} to project.
     * @param project The value for project
     * @return {@code this} builder for chained invocation
     */
    public final Builder project(com.fhir.uri project) {
      checkNotIsSet(projectIsSet(), "project");
      this.project = java.util.Objects.requireNonNull(project, "project");
      optBits |= OPT_BIT_PROJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#project() project} to project.
     * @param project The value for project
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    public final Builder project(java.util.Optional<? extends com.fhir.uri> project) {
      checkNotIsSet(projectIsSet(), "project");
      this.project = project.orElse(null);
      optBits |= OPT_BIT_PROJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastUpdated(com.fhir.instant lastUpdated) {
      checkNotIsSet(lastUpdatedIsSet(), "lastUpdated");
      this.lastUpdated = java.util.Objects.requireNonNull(lastUpdated, "lastUpdated");
      optBits |= OPT_BIT_LAST_UPDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
    public final Builder lastUpdated(java.util.Optional<? extends com.fhir.instant> lastUpdated) {
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
    public final Builder author(com.fhir.Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = java.util.Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public final Builder author(java.util.Optional<? extends com.fhir.Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#security() security} to security.
     * @param security The value for security
     * @return {@code this} builder for chained invocation
     */
    public final Builder security(java.util.List<com.fhir.Coding> security) {
      checkNotIsSet(securityIsSet(), "security");
      this.security = java.util.Objects.requireNonNull(security, "security");
      optBits |= OPT_BIT_SECURITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Meta#security() security} to security.
     * @param security The value for security
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("security")
    public final Builder security(java.util.Optional<? extends java.util.List<com.fhir.Coding>> security) {
      checkNotIsSet(securityIsSet(), "security");
      this.security = security.orElse(null);
      optBits |= OPT_BIT_SECURITY;
      return this;
    }

    /**
     * Builds a new {@link Meta Meta}.
     * @return An immutable instance of Meta
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Meta build() {
      return new ImmutableMeta(tag, versionId, source, profile, id, extension, project, lastUpdated, author, security);
    }

    private boolean tagIsSet() {
      return (optBits & OPT_BIT_TAG) != 0;
    }

    private boolean versionIdIsSet() {
      return (optBits & OPT_BIT_VERSION_ID) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean projectIsSet() {
      return (optBits & OPT_BIT_PROJECT) != 0;
    }

    private boolean lastUpdatedIsSet() {
      return (optBits & OPT_BIT_LAST_UPDATED) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean securityIsSet() {
      return (optBits & OPT_BIT_SECURITY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Meta is strict, attribute is already set: ".concat(name));
    }
  }
}
