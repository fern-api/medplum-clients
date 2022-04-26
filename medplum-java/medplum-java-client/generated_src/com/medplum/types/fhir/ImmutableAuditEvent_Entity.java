package com.medplum.types.fhir;

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
 * Immutable implementation of {@link AuditEvent_Entity}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuditEvent_Entity.builder()}.
 */
@Generated(from = "AuditEvent_Entity", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAuditEvent_Entity implements AuditEvent_Entity {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Coding type;
  private final @Nullable List<AuditEvent_Detail> detail;
  private final @Nullable Coding role;
  private final @Nullable Base64Binary query;
  private final @Nullable List<Coding> securityLabel;
  private final @Nullable Coding lifecycle;
  private final @Nullable Reference what;
  private final @Nullable String name;
  private final @Nullable String description;

  private ImmutableAuditEvent_Entity(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Coding type,
      @Nullable List<AuditEvent_Detail> detail,
      @Nullable Coding role,
      @Nullable Base64Binary query,
      @Nullable List<Coding> securityLabel,
      @Nullable Coding lifecycle,
      @Nullable Reference what,
      @Nullable String name,
      @Nullable String description) {
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.detail = detail;
    this.role = role;
    this.query = query;
    this.securityLabel = securityLabel;
    this.lifecycle = lifecycle;
    this.what = what;
    this.name = name;
    this.description = description;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Coding> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<List<AuditEvent_Detail>> detail() {
    return Optional.ofNullable(detail);
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<Coding> role() {
    return Optional.ofNullable(role);
  }

  /**
   * @return The value of the {@code query} attribute
   */
  @JsonProperty("query")
  @Override
  public Optional<Base64Binary> query() {
    return Optional.ofNullable(query);
  }

  /**
   * @return The value of the {@code securityLabel} attribute
   */
  @JsonProperty("securityLabel")
  @Override
  public Optional<List<Coding>> securityLabel() {
    return Optional.ofNullable(securityLabel);
  }

  /**
   * @return The value of the {@code lifecycle} attribute
   */
  @JsonProperty("lifecycle")
  @Override
  public Optional<Coding> lifecycle() {
    return Optional.ofNullable(lifecycle);
  }

  /**
   * @return The value of the {@code what} attribute
   */
  @JsonProperty("what")
  @Override
  public Optional<Reference> what() {
    return Optional.ofNullable(what);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAuditEvent_Entity(
        newValue,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAuditEvent_Entity(
        value,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        newValue,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        value,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        newValue,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        value,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withType(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        newValue,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withType(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        value,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withDetail(List<AuditEvent_Detail> value) {
    @Nullable List<AuditEvent_Detail> newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        newValue,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withDetail(Optional<? extends List<AuditEvent_Detail>> optional) {
    @Nullable List<AuditEvent_Detail> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        value,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withRole(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        newValue,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withRole(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        value,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#query() query} attribute.
   * @param value The value for query
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withQuery(Base64Binary value) {
    @Nullable Base64Binary newValue = Objects.requireNonNull(value, "query");
    if (this.query == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        newValue,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#query() query} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for query
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withQuery(Optional<? extends Base64Binary> optional) {
    @Nullable Base64Binary value = optional.orElse(null);
    if (this.query == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        value,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#securityLabel() securityLabel} attribute.
   * @param value The value for securityLabel
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withSecurityLabel(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "securityLabel");
    if (this.securityLabel == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        newValue,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#securityLabel() securityLabel} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabel
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withSecurityLabel(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.securityLabel == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        value,
        this.lifecycle,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#lifecycle() lifecycle} attribute.
   * @param value The value for lifecycle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withLifecycle(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "lifecycle");
    if (this.lifecycle == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        newValue,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#lifecycle() lifecycle} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lifecycle
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withLifecycle(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.lifecycle == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        value,
        this.what,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#what() what} attribute.
   * @param value The value for what
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withWhat(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "what");
    if (this.what == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        newValue,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#what() what} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for what
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withWhat(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.what == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        value,
        this.name,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAuditEvent_Entity(
        this.id,
        this.extension,
        this.modifierExtension,
        this.type,
        this.detail,
        this.role,
        this.query,
        this.securityLabel,
        this.lifecycle,
        this.what,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuditEvent_Entity} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuditEvent_Entity
        && equalTo((ImmutableAuditEvent_Entity) another);
  }

  private boolean equalTo(ImmutableAuditEvent_Entity another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type)
        && Objects.equals(detail, another.detail)
        && Objects.equals(role, another.role)
        && Objects.equals(query, another.query)
        && Objects.equals(securityLabel, another.securityLabel)
        && Objects.equals(lifecycle, another.lifecycle)
        && Objects.equals(what, another.what)
        && Objects.equals(name, another.name)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code modifierExtension}, {@code type}, {@code detail}, {@code role}, {@code query}, {@code securityLabel}, {@code lifecycle}, {@code what}, {@code name}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(query);
    h += (h << 5) + Objects.hashCode(securityLabel);
    h += (h << 5) + Objects.hashCode(lifecycle);
    h += (h << 5) + Objects.hashCode(what);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code AuditEvent_Entity} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AuditEvent_Entity{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (detail != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (role != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("role=").append(role);
    }
    if (query != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("query=").append(query);
    }
    if (securityLabel != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("securityLabel=").append(securityLabel);
    }
    if (lifecycle != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("lifecycle=").append(lifecycle);
    }
    if (what != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("what=").append(what);
    }
    if (name != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (description != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AuditEvent_Entity", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AuditEvent_Entity {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Coding> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<AuditEvent_Detail>> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable Optional<Coding> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<Base64Binary> query = Optional.empty();
    boolean queryIsSet;
    @Nullable Optional<List<Coding>> securityLabel = Optional.empty();
    boolean securityLabelIsSet;
    @Nullable Optional<Coding> lifecycle = Optional.empty();
    boolean lifecycleIsSet;
    @Nullable Optional<Reference> what = Optional.empty();
    boolean whatIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
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
    @JsonProperty("type")
    public void setType(Optional<Coding> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<List<AuditEvent_Detail>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("role")
    public void setRole(Optional<Coding> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @JsonProperty("query")
    public void setQuery(Optional<Base64Binary> query) {
      this.query = query;
      this.queryIsSet = true;
    }
    @JsonProperty("securityLabel")
    public void setSecurityLabel(Optional<List<Coding>> securityLabel) {
      this.securityLabel = securityLabel;
      this.securityLabelIsSet = true;
    }
    @JsonProperty("lifecycle")
    public void setLifecycle(Optional<Coding> lifecycle) {
      this.lifecycle = lifecycle;
      this.lifecycleIsSet = true;
    }
    @JsonProperty("what")
    public void setWhat(Optional<Reference> what) {
      this.what = what;
      this.whatIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<AuditEvent_Detail>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Base64Binary> query() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> securityLabel() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> lifecycle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> what() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAuditEvent_Entity fromJson(Json json) {
    ImmutableAuditEvent_Entity.Builder builder = ImmutableAuditEvent_Entity.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.queryIsSet) {
      builder.query(json.query);
    }
    if (json.securityLabelIsSet) {
      builder.securityLabel(json.securityLabel);
    }
    if (json.lifecycleIsSet) {
      builder.lifecycle(json.lifecycle);
    }
    if (json.whatIsSet) {
      builder.what(json.what);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableAuditEvent_Entity) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuditEvent_Entity} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuditEvent_Entity instance
   */
  public static AuditEvent_Entity copyOf(AuditEvent_Entity instance) {
    if (instance instanceof ImmutableAuditEvent_Entity) {
      return (ImmutableAuditEvent_Entity) instance;
    }
    return ImmutableAuditEvent_Entity.builder()
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .detail(instance.detail())
        .role(instance.role())
        .query(instance.query())
        .securityLabel(instance.securityLabel())
        .lifecycle(instance.lifecycle())
        .what(instance.what())
        .name(instance.name())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link AuditEvent_Entity AuditEvent_Entity}.
   * <pre>
   * ImmutableAuditEvent_Entity.builder()
   *    .id(String) // optional {@link AuditEvent_Entity#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Entity#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Entity#modifierExtension() modifierExtension}
   *    .type(com.medplum.types.fhir.Coding) // optional {@link AuditEvent_Entity#type() type}
   *    .detail(List&amp;lt;com.medplum.types.fhir.AuditEvent_Detail&amp;gt;) // optional {@link AuditEvent_Entity#detail() detail}
   *    .role(com.medplum.types.fhir.Coding) // optional {@link AuditEvent_Entity#role() role}
   *    .query(com.medplum.types.fhir.Base64Binary) // optional {@link AuditEvent_Entity#query() query}
   *    .securityLabel(List&amp;lt;com.medplum.types.fhir.Coding&amp;gt;) // optional {@link AuditEvent_Entity#securityLabel() securityLabel}
   *    .lifecycle(com.medplum.types.fhir.Coding) // optional {@link AuditEvent_Entity#lifecycle() lifecycle}
   *    .what(com.medplum.types.fhir.Reference) // optional {@link AuditEvent_Entity#what() what}
   *    .name(String) // optional {@link AuditEvent_Entity#name() name}
   *    .description(String) // optional {@link AuditEvent_Entity#description() description}
   *    .build();
   * </pre>
   * @return A new AuditEvent_Entity builder
   */
  public static ImmutableAuditEvent_Entity.Builder builder() {
    return new ImmutableAuditEvent_Entity.Builder();
  }

  /**
   * Builds instances of type {@link AuditEvent_Entity AuditEvent_Entity}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AuditEvent_Entity", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_DETAIL = 0x10L;
    private static final long OPT_BIT_ROLE = 0x20L;
    private static final long OPT_BIT_QUERY = 0x40L;
    private static final long OPT_BIT_SECURITY_LABEL = 0x80L;
    private static final long OPT_BIT_LIFECYCLE = 0x100L;
    private static final long OPT_BIT_WHAT = 0x200L;
    private static final long OPT_BIT_NAME = 0x400L;
    private static final long OPT_BIT_DESCRIPTION = 0x800L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Coding type;
    private @Nullable List<AuditEvent_Detail> detail;
    private @Nullable Coding role;
    private @Nullable Base64Binary query;
    private @Nullable List<Coding> securityLabel;
    private @Nullable Coding lifecycle;
    private @Nullable Reference what;
    private @Nullable String name;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Entity#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Entity#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent_Entity#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent_Entity#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent_Entity#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent_Entity#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Coding type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Coding> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(List<AuditEvent_Detail> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends List<AuditEvent_Detail>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(Coding role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends Coding> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#query() query} to query.
     * @param query The value for query
     * @return {@code this} builder for chained invocation
     */
    public final Builder query(Base64Binary query) {
      checkNotIsSet(queryIsSet(), "query");
      this.query = Objects.requireNonNull(query, "query");
      optBits |= OPT_BIT_QUERY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#query() query} to query.
     * @param query The value for query
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("query")
    public final Builder query(Optional<? extends Base64Binary> query) {
      checkNotIsSet(queryIsSet(), "query");
      this.query = query.orElse(null);
      optBits |= OPT_BIT_QUERY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabel(List<Coding> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = Objects.requireNonNull(securityLabel, "securityLabel");
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("securityLabel")
    public final Builder securityLabel(Optional<? extends List<Coding>> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = securityLabel.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#lifecycle() lifecycle} to lifecycle.
     * @param lifecycle The value for lifecycle
     * @return {@code this} builder for chained invocation
     */
    public final Builder lifecycle(Coding lifecycle) {
      checkNotIsSet(lifecycleIsSet(), "lifecycle");
      this.lifecycle = Objects.requireNonNull(lifecycle, "lifecycle");
      optBits |= OPT_BIT_LIFECYCLE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#lifecycle() lifecycle} to lifecycle.
     * @param lifecycle The value for lifecycle
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lifecycle")
    public final Builder lifecycle(Optional<? extends Coding> lifecycle) {
      checkNotIsSet(lifecycleIsSet(), "lifecycle");
      this.lifecycle = lifecycle.orElse(null);
      optBits |= OPT_BIT_LIFECYCLE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#what() what} to what.
     * @param what The value for what
     * @return {@code this} builder for chained invocation
     */
    public final Builder what(Reference what) {
      checkNotIsSet(whatIsSet(), "what");
      this.what = Objects.requireNonNull(what, "what");
      optBits |= OPT_BIT_WHAT;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#what() what} to what.
     * @param what The value for what
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("what")
    public final Builder what(Optional<? extends Reference> what) {
      checkNotIsSet(whatIsSet(), "what");
      this.what = what.orElse(null);
      optBits |= OPT_BIT_WHAT;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#name() name} to name.
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
     * Initializes the optional value {@link AuditEvent_Entity#name() name} to name.
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
     * Initializes the optional value {@link AuditEvent_Entity#description() description} to description.
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
     * Initializes the optional value {@link AuditEvent_Entity#description() description} to description.
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
     * Builds a new {@link AuditEvent_Entity AuditEvent_Entity}.
     * @return An immutable instance of AuditEvent_Entity
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AuditEvent_Entity build() {
      return new ImmutableAuditEvent_Entity(
          id,
          extension,
          modifierExtension,
          type,
          detail,
          role,
          query,
          securityLabel,
          lifecycle,
          what,
          name,
          description);
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

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean queryIsSet() {
      return (optBits & OPT_BIT_QUERY) != 0;
    }

    private boolean securityLabelIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL) != 0;
    }

    private boolean lifecycleIsSet() {
      return (optBits & OPT_BIT_LIFECYCLE) != 0;
    }

    private boolean whatIsSet() {
      return (optBits & OPT_BIT_WHAT) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AuditEvent_Entity is strict, attribute is already set: ".concat(name));
    }
  }
}
