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
 * Immutable implementation of {@link ImplementationGuide_Resource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Resource.builder()}.
 */
@Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Resource
    implements ImplementationGuide_Resource {
  private final @Nullable Boolean exampleBoolean;
  private final @Nullable Id groupingId;
  private final @Nullable String name;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Implementationguide_resourceFhirversionItem> fhirVersion;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final Reference reference;
  private final @Nullable String exampleCanonical;
  private final @Nullable String description;

  private ImmutableImplementationGuide_Resource(
      @Nullable Boolean exampleBoolean,
      @Nullable Id groupingId,
      @Nullable String name,
      @Nullable List<Extension> extension,
      @Nullable List<Implementationguide_resourceFhirversionItem> fhirVersion,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      Reference reference,
      @Nullable String exampleCanonical,
      @Nullable String description) {
    this.exampleBoolean = exampleBoolean;
    this.groupingId = groupingId;
    this.name = name;
    this.extension = extension;
    this.fhirVersion = fhirVersion;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.reference = reference;
    this.exampleCanonical = exampleCanonical;
    this.description = description;
  }

  /**
   * @return The value of the {@code exampleBoolean} attribute
   */
  @JsonProperty("exampleBoolean")
  @Override
  public Optional<Boolean> exampleBoolean() {
    return Optional.ofNullable(exampleBoolean);
  }

  /**
   * @return The value of the {@code groupingId} attribute
   */
  @JsonProperty("groupingId")
  @Override
  public Optional<Id> groupingId() {
    return Optional.ofNullable(groupingId);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code fhirVersion} attribute
   */
  @JsonProperty("fhirVersion")
  @Override
  public Optional<List<Implementationguide_resourceFhirversionItem>> fhirVersion() {
    return Optional.ofNullable(fhirVersion);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Reference reference() {
    return reference;
  }

  /**
   * @return The value of the {@code exampleCanonical} attribute
   */
  @JsonProperty("exampleCanonical")
  @Override
  public Optional<String> exampleCanonical() {
    return Optional.ofNullable(exampleCanonical);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} attribute.
   * @param value The value for exampleBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExampleBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.exampleBoolean, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        newValue,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exampleBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExampleBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.exampleBoolean, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        value,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#groupingId() groupingId} attribute.
   * @param value The value for groupingId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withGroupingId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "groupingId");
    if (this.groupingId == newValue) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        newValue,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#groupingId() groupingId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupingId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource withGroupingId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.groupingId == value) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        value,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        newValue,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        value,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        newValue,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        value,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} attribute.
   * @param value The value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withFhirVersion(List<Implementationguide_resourceFhirversionItem> value) {
    @Nullable List<Implementationguide_resourceFhirversionItem> newValue = Objects.requireNonNull(value, "fhirVersion");
    if (this.fhirVersion == newValue) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource withFhirVersion(Optional<? extends List<Implementationguide_resourceFhirversionItem>> optional) {
    @Nullable List<Implementationguide_resourceFhirversionItem> value = optional.orElse(null);
    if (this.fhirVersion == value) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        value,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        newValue,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        value,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        newValue,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        value,
        this.reference,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImplementationGuide_Resource#reference() reference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withReference(Reference value) {
    if (this.reference == value) return this;
    Reference newValue = Objects.requireNonNull(value, "reference");
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        newValue,
        this.exampleCanonical,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} attribute.
   * @param value The value for exampleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExampleCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "exampleCanonical");
    if (Objects.equals(this.exampleCanonical, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exampleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExampleCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.exampleCanonical, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.exampleBoolean,
        this.groupingId,
        this.name,
        this.extension,
        this.fhirVersion,
        this.id,
        this.modifierExtension,
        this.reference,
        this.exampleCanonical,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Resource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Resource
        && equalTo((ImmutableImplementationGuide_Resource) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Resource another) {
    return Objects.equals(exampleBoolean, another.exampleBoolean)
        && Objects.equals(groupingId, another.groupingId)
        && Objects.equals(name, another.name)
        && Objects.equals(extension, another.extension)
        && Objects.equals(fhirVersion, another.fhirVersion)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && reference.equals(another.reference)
        && Objects.equals(exampleCanonical, another.exampleCanonical)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code exampleBoolean}, {@code groupingId}, {@code name}, {@code extension}, {@code fhirVersion}, {@code id}, {@code modifierExtension}, {@code reference}, {@code exampleCanonical}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(exampleBoolean);
    h += (h << 5) + Objects.hashCode(groupingId);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(fhirVersion);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + reference.hashCode();
    h += (h << 5) + Objects.hashCode(exampleCanonical);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Resource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide_Resource{");
    if (exampleBoolean != null) {
      builder.append("exampleBoolean=").append(exampleBoolean);
    }
    if (groupingId != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("groupingId=").append(groupingId);
    }
    if (name != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (fhirVersion != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("fhirVersion=").append(fhirVersion);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("reference=").append(reference);
    if (exampleCanonical != null) {
      builder.append(", ");
      builder.append("exampleCanonical=").append(exampleCanonical);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide_Resource {
    @Nullable Optional<Boolean> exampleBoolean = Optional.empty();
    boolean exampleBooleanIsSet;
    @Nullable Optional<Id> groupingId = Optional.empty();
    boolean groupingIdIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Implementationguide_resourceFhirversionItem>> fhirVersion = Optional.empty();
    boolean fhirVersionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Reference reference;
    @Nullable Optional<String> exampleCanonical = Optional.empty();
    boolean exampleCanonicalIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("exampleBoolean")
    public void setExampleBoolean(Optional<Boolean> exampleBoolean) {
      this.exampleBoolean = exampleBoolean;
      this.exampleBooleanIsSet = true;
    }
    @JsonProperty("groupingId")
    public void setGroupingId(Optional<Id> groupingId) {
      this.groupingId = groupingId;
      this.groupingIdIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("fhirVersion")
    public void setFhirVersion(Optional<List<Implementationguide_resourceFhirversionItem>> fhirVersion) {
      this.fhirVersion = fhirVersion;
      this.fhirVersionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("reference")
    public void setReference(Reference reference) {
      this.reference = reference;
    }
    @JsonProperty("exampleCanonical")
    public void setExampleCanonical(Optional<String> exampleCanonical) {
      this.exampleCanonical = exampleCanonical;
      this.exampleCanonicalIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<Boolean> exampleBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> groupingId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Implementationguide_resourceFhirversionItem>> fhirVersion() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> exampleCanonical() { throw new UnsupportedOperationException(); }
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
  static ImmutableImplementationGuide_Resource fromJson(Json json) {
    ImmutableImplementationGuide_Resource.Builder builder = ((ImmutableImplementationGuide_Resource.Builder) ImmutableImplementationGuide_Resource.builder());
    if (json.exampleBooleanIsSet) {
      builder.exampleBoolean(json.exampleBoolean);
    }
    if (json.groupingIdIsSet) {
      builder.groupingId(json.groupingId);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.fhirVersionIsSet) {
      builder.fhirVersion(json.fhirVersion);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.reference != null) {
      builder.reference(json.reference);
    }
    if (json.exampleCanonicalIsSet) {
      builder.exampleCanonical(json.exampleCanonical);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableImplementationGuide_Resource) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Resource} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Resource instance
   */
  public static ImplementationGuide_Resource copyOf(ImplementationGuide_Resource instance) {
    if (instance instanceof ImmutableImplementationGuide_Resource) {
      return (ImmutableImplementationGuide_Resource) instance;
    }
    return ((ImmutableImplementationGuide_Resource.Builder) ImmutableImplementationGuide_Resource.builder())
        .exampleBoolean(instance.exampleBoolean())
        .groupingId(instance.groupingId())
        .name(instance.name())
        .extension(instance.extension())
        .fhirVersion(instance.fhirVersion())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .reference(instance.reference())
        .exampleCanonical(instance.exampleCanonical())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Resource ImplementationGuide_Resource}.
   * <pre>
   * ImmutableImplementationGuide_Resource.builder()
   *    .exampleBoolean(Boolean) // optional {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean}
   *    .groupingId(com.medplum.types.fhir.Id) // optional {@link ImplementationGuide_Resource#groupingId() groupingId}
   *    .name(String) // optional {@link ImplementationGuide_Resource#name() name}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Resource#extension() extension}
   *    .fhirVersion(List&amp;lt;com.medplum.types.fhir.Implementationguide_resourceFhirversionItem&amp;gt;) // optional {@link ImplementationGuide_Resource#fhirVersion() fhirVersion}
   *    .id(String) // optional {@link ImplementationGuide_Resource#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Resource#modifierExtension() modifierExtension}
   *    .reference(com.medplum.types.fhir.Reference) // required {@link ImplementationGuide_Resource#reference() reference}
   *    .exampleCanonical(String) // optional {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical}
   *    .description(String) // optional {@link ImplementationGuide_Resource#description() description}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Resource builder
   */
  public static ReferenceBuildStage builder() {
    return new ImmutableImplementationGuide_Resource.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Resource ImplementationGuide_Resource}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ReferenceBuildStage, BuildFinal {
    private static final long INIT_BIT_REFERENCE = 0x1L;
    private static final long OPT_BIT_EXAMPLE_BOOLEAN = 0x1L;
    private static final long OPT_BIT_GROUPING_ID = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_FHIR_VERSION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_EXAMPLE_CANONICAL = 0x80L;
    private static final long OPT_BIT_DESCRIPTION = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Boolean exampleBoolean;
    private @Nullable Id groupingId;
    private @Nullable String name;
    private @Nullable List<Extension> extension;
    private @Nullable List<Implementationguide_resourceFhirversionItem> fhirVersion;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference reference;
    private @Nullable String exampleCanonical;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder exampleBoolean(boolean exampleBoolean) {
      checkNotIsSet(exampleBooleanIsSet(), "exampleBoolean");
      this.exampleBoolean = exampleBoolean;
      optBits |= OPT_BIT_EXAMPLE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exampleBoolean")
    public final Builder exampleBoolean(Optional<Boolean> exampleBoolean) {
      checkNotIsSet(exampleBooleanIsSet(), "exampleBoolean");
      this.exampleBoolean = exampleBoolean.orElse(null);
      optBits |= OPT_BIT_EXAMPLE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#groupingId() groupingId} to groupingId.
     * @param groupingId The value for groupingId
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupingId(Id groupingId) {
      checkNotIsSet(groupingIdIsSet(), "groupingId");
      this.groupingId = Objects.requireNonNull(groupingId, "groupingId");
      optBits |= OPT_BIT_GROUPING_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#groupingId() groupingId} to groupingId.
     * @param groupingId The value for groupingId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("groupingId")
    public final Builder groupingId(Optional<? extends Id> groupingId) {
      checkNotIsSet(groupingIdIsSet(), "groupingId");
      this.groupingId = groupingId.orElse(null);
      optBits |= OPT_BIT_GROUPING_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#name() name} to name.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#name() name} to name.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder fhirVersion(List<Implementationguide_resourceFhirversionItem> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = Objects.requireNonNull(fhirVersion, "fhirVersion");
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fhirVersion")
    public final Builder fhirVersion(Optional<? extends List<Implementationguide_resourceFhirversionItem>> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = fhirVersion.orElse(null);
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link ImplementationGuide_Resource#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Reference reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      initBits &= ~INIT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder exampleCanonical(String exampleCanonical) {
      checkNotIsSet(exampleCanonicalIsSet(), "exampleCanonical");
      this.exampleCanonical = Objects.requireNonNull(exampleCanonical, "exampleCanonical");
      optBits |= OPT_BIT_EXAMPLE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exampleCanonical")
    public final Builder exampleCanonical(Optional<String> exampleCanonical) {
      checkNotIsSet(exampleCanonicalIsSet(), "exampleCanonical");
      this.exampleCanonical = exampleCanonical.orElse(null);
      optBits |= OPT_BIT_EXAMPLE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#description() description} to description.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#description() description} to description.
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
     * Builds a new {@link ImplementationGuide_Resource ImplementationGuide_Resource}.
     * @return An immutable instance of ImplementationGuide_Resource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide_Resource build() {
      checkRequiredAttributes();
      return new ImmutableImplementationGuide_Resource(
          exampleBoolean,
          groupingId,
          name,
          extension,
          fhirVersion,
          id,
          modifierExtension,
          reference,
          exampleCanonical,
          description);
    }

    private boolean exampleBooleanIsSet() {
      return (optBits & OPT_BIT_EXAMPLE_BOOLEAN) != 0;
    }

    private boolean groupingIdIsSet() {
      return (optBits & OPT_BIT_GROUPING_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean fhirVersionIsSet() {
      return (optBits & OPT_BIT_FHIR_VERSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean exampleCanonicalIsSet() {
      return (optBits & OPT_BIT_EXAMPLE_CANONICAL) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean referenceIsSet() {
      return (initBits & INIT_BIT_REFERENCE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide_Resource is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!referenceIsSet()) attributes.add("reference");
      return "Cannot build ImplementationGuide_Resource, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
  public interface ReferenceBuildStage {
    /**
     * Initializes the value for the {@link ImplementationGuide_Resource#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reference(Reference reference);
  }

  @Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exampleBoolean(boolean exampleBoolean);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exampleBoolean(Optional<Boolean> exampleBoolean);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#groupingId() groupingId} to groupingId.
     * @param groupingId The value for groupingId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupingId(Id groupingId);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#groupingId() groupingId} to groupingId.
     * @param groupingId The value for groupingId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupingId(Optional<? extends Id> groupingId);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fhirVersion(List<Implementationguide_resourceFhirversionItem> fhirVersion);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fhirVersion(Optional<? extends List<Implementationguide_resourceFhirversionItem>> fhirVersion);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exampleCanonical(String exampleCanonical);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exampleCanonical(Optional<String> exampleCanonical);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Builds a new {@link ImplementationGuide_Resource ImplementationGuide_Resource}.
     * @return An immutable instance of ImplementationGuide_Resource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImplementationGuide_Resource build();
  }
}
