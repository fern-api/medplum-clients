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
 * Immutable implementation of {@link MolecularSequence_Repository}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence_Repository.builder()}.
 */
@Generated(from = "MolecularSequence_Repository", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence_Repository
    implements MolecularSequence_Repository {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable String datasetId;
  private final @Nullable String name;
  private final @Nullable String readsetId;
  private final @Nullable List<Extension> extension;
  private final @Nullable Uri url;
  private final @Nullable Molecularsequence_RepositoryType type;
  private final @Nullable String variantsetId;

  private ImmutableMolecularSequence_Repository(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable String datasetId,
      @Nullable String name,
      @Nullable String readsetId,
      @Nullable List<Extension> extension,
      @Nullable Uri url,
      @Nullable Molecularsequence_RepositoryType type,
      @Nullable String variantsetId) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.datasetId = datasetId;
    this.name = name;
    this.readsetId = readsetId;
    this.extension = extension;
    this.url = url;
    this.type = type;
    this.variantsetId = variantsetId;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code datasetId} attribute
   */
  @JsonProperty("datasetId")
  @Override
  public Optional<String> datasetId() {
    return Optional.ofNullable(datasetId);
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
   * @return The value of the {@code readsetId} attribute
   */
  @JsonProperty("readsetId")
  @Override
  public Optional<String> readsetId() {
    return Optional.ofNullable(readsetId);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Molecularsequence_RepositoryType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code variantsetId} attribute
   */
  @JsonProperty("variantsetId")
  @Override
  public Optional<String> variantsetId() {
    return Optional.ofNullable(variantsetId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence_Repository(
        newValue,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Repository withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence_Repository(
        value,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        newValue,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        value,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#datasetId() datasetId} attribute.
   * @param value The value for datasetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withDatasetId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "datasetId");
    if (Objects.equals(this.datasetId, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        newValue,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#datasetId() datasetId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for datasetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withDatasetId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.datasetId, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        value,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        newValue,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        value,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#readsetId() readsetId} attribute.
   * @param value The value for readsetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withReadsetId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "readsetId");
    if (Objects.equals(this.readsetId, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        newValue,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#readsetId() readsetId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readsetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withReadsetId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.readsetId, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        value,
        this.extension,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        newValue,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Repository withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        value,
        this.url,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        newValue,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Repository withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        value,
        this.type,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withType(Molecularsequence_RepositoryType value) {
    @Nullable Molecularsequence_RepositoryType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        newValue,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Repository withType(Optional<? extends Molecularsequence_RepositoryType> optional) {
    @Nullable Molecularsequence_RepositoryType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        value,
        this.variantsetId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#variantsetId() variantsetId} attribute.
   * @param value The value for variantsetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withVariantsetId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "variantsetId");
    if (Objects.equals(this.variantsetId, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#variantsetId() variantsetId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variantsetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withVariantsetId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.variantsetId, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.modifierExtension,
        this.id,
        this.datasetId,
        this.name,
        this.readsetId,
        this.extension,
        this.url,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence_Repository} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence_Repository
        && equalTo((ImmutableMolecularSequence_Repository) another);
  }

  private boolean equalTo(ImmutableMolecularSequence_Repository another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(datasetId, another.datasetId)
        && Objects.equals(name, another.name)
        && Objects.equals(readsetId, another.readsetId)
        && Objects.equals(extension, another.extension)
        && Objects.equals(url, another.url)
        && Objects.equals(type, another.type)
        && Objects.equals(variantsetId, another.variantsetId);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code datasetId}, {@code name}, {@code readsetId}, {@code extension}, {@code url}, {@code type}, {@code variantsetId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(datasetId);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(readsetId);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(variantsetId);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_Repository} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MolecularSequence_Repository{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (datasetId != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("datasetId=").append(datasetId);
    }
    if (name != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (readsetId != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("readsetId=").append(readsetId);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (url != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (type != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (variantsetId != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("variantsetId=").append(variantsetId);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MolecularSequence_Repository", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MolecularSequence_Repository {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> datasetId = Optional.empty();
    boolean datasetIdIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> readsetId = Optional.empty();
    boolean readsetIdIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Molecularsequence_RepositoryType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> variantsetId = Optional.empty();
    boolean variantsetIdIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("datasetId")
    public void setDatasetId(Optional<String> datasetId) {
      this.datasetId = datasetId;
      this.datasetIdIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("readsetId")
    public void setReadsetId(Optional<String> readsetId) {
      this.readsetId = readsetId;
      this.readsetIdIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Molecularsequence_RepositoryType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("variantsetId")
    public void setVariantsetId(Optional<String> variantsetId) {
      this.variantsetId = variantsetId;
      this.variantsetIdIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> datasetId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> readsetId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Molecularsequence_RepositoryType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> variantsetId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMolecularSequence_Repository fromJson(Json json) {
    ImmutableMolecularSequence_Repository.Builder builder = ImmutableMolecularSequence_Repository.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.datasetIdIsSet) {
      builder.datasetId(json.datasetId);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.readsetIdIsSet) {
      builder.readsetId(json.readsetId);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.variantsetIdIsSet) {
      builder.variantsetId(json.variantsetId);
    }
    return (ImmutableMolecularSequence_Repository) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MolecularSequence_Repository} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MolecularSequence_Repository instance
   */
  public static MolecularSequence_Repository copyOf(MolecularSequence_Repository instance) {
    if (instance instanceof ImmutableMolecularSequence_Repository) {
      return (ImmutableMolecularSequence_Repository) instance;
    }
    return ImmutableMolecularSequence_Repository.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .datasetId(instance.datasetId())
        .name(instance.name())
        .readsetId(instance.readsetId())
        .extension(instance.extension())
        .url(instance.url())
        .type(instance.type())
        .variantsetId(instance.variantsetId())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_Repository MolecularSequence_Repository}.
   * <pre>
   * ImmutableMolecularSequence_Repository.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Repository#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link MolecularSequence_Repository#id() id}
   *    .datasetId(String) // optional {@link MolecularSequence_Repository#datasetId() datasetId}
   *    .name(String) // optional {@link MolecularSequence_Repository#name() name}
   *    .readsetId(String) // optional {@link MolecularSequence_Repository#readsetId() readsetId}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Repository#extension() extension}
   *    .url(com.fhir.types.fhir.Uri) // optional {@link MolecularSequence_Repository#url() url}
   *    .type(Molecularsequence_RepositoryType) // optional {@link MolecularSequence_Repository#type() type}
   *    .variantsetId(String) // optional {@link MolecularSequence_Repository#variantsetId() variantsetId}
   *    .build();
   * </pre>
   * @return A new MolecularSequence_Repository builder
   */
  public static ImmutableMolecularSequence_Repository.Builder builder() {
    return new ImmutableMolecularSequence_Repository.Builder();
  }

  /**
   * Builds instances of type {@link MolecularSequence_Repository MolecularSequence_Repository}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MolecularSequence_Repository", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_DATASET_ID = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_READSET_ID = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_URL = 0x40L;
    private static final long OPT_BIT_TYPE = 0x80L;
    private static final long OPT_BIT_VARIANTSET_ID = 0x100L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable String datasetId;
    private @Nullable String name;
    private @Nullable String readsetId;
    private @Nullable List<Extension> extension;
    private @Nullable Uri url;
    private @Nullable Molecularsequence_RepositoryType type;
    private @Nullable String variantsetId;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Repository#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Repository#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Repository#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Repository#datasetId() datasetId} to datasetId.
     * @param datasetId The value for datasetId
     * @return {@code this} builder for chained invocation
     */
    public final Builder datasetId(String datasetId) {
      checkNotIsSet(datasetIdIsSet(), "datasetId");
      this.datasetId = Objects.requireNonNull(datasetId, "datasetId");
      optBits |= OPT_BIT_DATASET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#datasetId() datasetId} to datasetId.
     * @param datasetId The value for datasetId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("datasetId")
    public final Builder datasetId(Optional<String> datasetId) {
      checkNotIsSet(datasetIdIsSet(), "datasetId");
      this.datasetId = datasetId.orElse(null);
      optBits |= OPT_BIT_DATASET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#name() name} to name.
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
     * Initializes the optional value {@link MolecularSequence_Repository#name() name} to name.
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
     * Initializes the optional value {@link MolecularSequence_Repository#readsetId() readsetId} to readsetId.
     * @param readsetId The value for readsetId
     * @return {@code this} builder for chained invocation
     */
    public final Builder readsetId(String readsetId) {
      checkNotIsSet(readsetIdIsSet(), "readsetId");
      this.readsetId = Objects.requireNonNull(readsetId, "readsetId");
      optBits |= OPT_BIT_READSET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#readsetId() readsetId} to readsetId.
     * @param readsetId The value for readsetId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("readsetId")
    public final Builder readsetId(Optional<String> readsetId) {
      checkNotIsSet(readsetIdIsSet(), "readsetId");
      this.readsetId = readsetId.orElse(null);
      optBits |= OPT_BIT_READSET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Repository#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Repository#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Molecularsequence_RepositoryType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Molecularsequence_RepositoryType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#variantsetId() variantsetId} to variantsetId.
     * @param variantsetId The value for variantsetId
     * @return {@code this} builder for chained invocation
     */
    public final Builder variantsetId(String variantsetId) {
      checkNotIsSet(variantsetIdIsSet(), "variantsetId");
      this.variantsetId = Objects.requireNonNull(variantsetId, "variantsetId");
      optBits |= OPT_BIT_VARIANTSET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#variantsetId() variantsetId} to variantsetId.
     * @param variantsetId The value for variantsetId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variantsetId")
    public final Builder variantsetId(Optional<String> variantsetId) {
      checkNotIsSet(variantsetIdIsSet(), "variantsetId");
      this.variantsetId = variantsetId.orElse(null);
      optBits |= OPT_BIT_VARIANTSET_ID;
      return this;
    }

    /**
     * Builds a new {@link MolecularSequence_Repository MolecularSequence_Repository}.
     * @return An immutable instance of MolecularSequence_Repository
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MolecularSequence_Repository build() {
      return new ImmutableMolecularSequence_Repository(modifierExtension, id, datasetId, name, readsetId, extension, url, type, variantsetId);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean datasetIdIsSet() {
      return (optBits & OPT_BIT_DATASET_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean readsetIdIsSet() {
      return (optBits & OPT_BIT_READSET_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean variantsetIdIsSet() {
      return (optBits & OPT_BIT_VARIANTSET_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MolecularSequence_Repository is strict, attribute is already set: ".concat(name));
    }
  }
}
