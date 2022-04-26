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
 * Immutable implementation of {@link CatalogEntry_RelatedEntry}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCatalogEntry_RelatedEntry.builder()}.
 */
@Generated(from = "CatalogEntry_RelatedEntry", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCatalogEntry_RelatedEntry
    implements CatalogEntry_RelatedEntry {
  private final @Nullable List<Extension> modifierExtension;
  private final Reference item;
  private final @Nullable String id;
  private final @Nullable Catalogentry_relatedentryRelationtype relationtype;
  private final @Nullable List<Extension> extension;

  private ImmutableCatalogEntry_RelatedEntry(
      @Nullable List<Extension> modifierExtension,
      Reference item,
      @Nullable String id,
      @Nullable Catalogentry_relatedentryRelationtype relationtype,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.item = item;
    this.id = id;
    this.relationtype = relationtype;
    this.extension = extension;
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
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Reference item() {
    return item;
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
   * @return The value of the {@code relationtype} attribute
   */
  @JsonProperty("relationtype")
  @Override
  public Optional<Catalogentry_relatedentryRelationtype> relationtype() {
    return Optional.ofNullable(relationtype);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry_RelatedEntry#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry_RelatedEntry withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCatalogEntry_RelatedEntry(newValue, this.item, this.id, this.relationtype, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry_RelatedEntry#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry_RelatedEntry withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCatalogEntry_RelatedEntry(value, this.item, this.id, this.relationtype, this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CatalogEntry_RelatedEntry#item() item} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for item
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCatalogEntry_RelatedEntry withItem(Reference value) {
    if (this.item == value) return this;
    Reference newValue = Objects.requireNonNull(value, "item");
    return new ImmutableCatalogEntry_RelatedEntry(this.modifierExtension, newValue, this.id, this.relationtype, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry_RelatedEntry#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry_RelatedEntry withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCatalogEntry_RelatedEntry(this.modifierExtension, this.item, newValue, this.relationtype, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry_RelatedEntry#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry_RelatedEntry withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCatalogEntry_RelatedEntry(this.modifierExtension, this.item, value, this.relationtype, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry_RelatedEntry#relationtype() relationtype} attribute.
   * @param value The value for relationtype
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry_RelatedEntry withRelationtype(Catalogentry_relatedentryRelationtype value) {
    @Nullable Catalogentry_relatedentryRelationtype newValue = Objects.requireNonNull(value, "relationtype");
    if (this.relationtype == newValue) return this;
    return new ImmutableCatalogEntry_RelatedEntry(this.modifierExtension, this.item, this.id, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry_RelatedEntry#relationtype() relationtype} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationtype
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry_RelatedEntry withRelationtype(Optional<? extends Catalogentry_relatedentryRelationtype> optional) {
    @Nullable Catalogentry_relatedentryRelationtype value = optional.orElse(null);
    if (this.relationtype == value) return this;
    return new ImmutableCatalogEntry_RelatedEntry(this.modifierExtension, this.item, this.id, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry_RelatedEntry#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry_RelatedEntry withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCatalogEntry_RelatedEntry(this.modifierExtension, this.item, this.id, this.relationtype, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry_RelatedEntry#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry_RelatedEntry withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCatalogEntry_RelatedEntry(this.modifierExtension, this.item, this.id, this.relationtype, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCatalogEntry_RelatedEntry} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCatalogEntry_RelatedEntry
        && equalTo((ImmutableCatalogEntry_RelatedEntry) another);
  }

  private boolean equalTo(ImmutableCatalogEntry_RelatedEntry another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && item.equals(another.item)
        && Objects.equals(id, another.id)
        && Objects.equals(relationtype, another.relationtype)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code item}, {@code id}, {@code relationtype}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + item.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(relationtype);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code CatalogEntry_RelatedEntry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CatalogEntry_RelatedEntry{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 26) builder.append(", ");
    builder.append("item=").append(item);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (relationtype != null) {
      builder.append(", ");
      builder.append("relationtype=").append(relationtype);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CatalogEntry_RelatedEntry", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CatalogEntry_RelatedEntry {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Reference item;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Catalogentry_relatedentryRelationtype> relationtype = Optional.empty();
    boolean relationtypeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Reference item) {
      this.item = item;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("relationtype")
    public void setRelationtype(Optional<Catalogentry_relatedentryRelationtype> relationtype) {
      this.relationtype = relationtype;
      this.relationtypeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Catalogentry_relatedentryRelationtype> relationtype() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCatalogEntry_RelatedEntry fromJson(Json json) {
    ImmutableCatalogEntry_RelatedEntry.Builder builder = ((ImmutableCatalogEntry_RelatedEntry.Builder) ImmutableCatalogEntry_RelatedEntry.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.item != null) {
      builder.item(json.item);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.relationtypeIsSet) {
      builder.relationtype(json.relationtype);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableCatalogEntry_RelatedEntry) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CatalogEntry_RelatedEntry} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CatalogEntry_RelatedEntry instance
   */
  public static CatalogEntry_RelatedEntry copyOf(CatalogEntry_RelatedEntry instance) {
    if (instance instanceof ImmutableCatalogEntry_RelatedEntry) {
      return (ImmutableCatalogEntry_RelatedEntry) instance;
    }
    return ((ImmutableCatalogEntry_RelatedEntry.Builder) ImmutableCatalogEntry_RelatedEntry.builder())
        .modifierExtension(instance.modifierExtension())
        .item(instance.item())
        .id(instance.id())
        .relationtype(instance.relationtype())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link CatalogEntry_RelatedEntry CatalogEntry_RelatedEntry}.
   * <pre>
   * ImmutableCatalogEntry_RelatedEntry.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CatalogEntry_RelatedEntry#modifierExtension() modifierExtension}
   *    .item(com.medplum.types.fhir.Reference) // required {@link CatalogEntry_RelatedEntry#item() item}
   *    .id(String) // optional {@link CatalogEntry_RelatedEntry#id() id}
   *    .relationtype(com.medplum.types.fhir.Catalogentry_relatedentryRelationtype) // optional {@link CatalogEntry_RelatedEntry#relationtype() relationtype}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CatalogEntry_RelatedEntry#extension() extension}
   *    .build();
   * </pre>
   * @return A new CatalogEntry_RelatedEntry builder
   */
  public static ItemBuildStage builder() {
    return new ImmutableCatalogEntry_RelatedEntry.Builder();
  }

  /**
   * Builds instances of type {@link CatalogEntry_RelatedEntry CatalogEntry_RelatedEntry}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CatalogEntry_RelatedEntry", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ItemBuildStage, BuildFinal {
    private static final long INIT_BIT_ITEM = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_RELATIONTYPE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference item;
    private @Nullable String id;
    private @Nullable Catalogentry_relatedentryRelationtype relationtype;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link CatalogEntry_RelatedEntry#item() item} attribute.
     * @param item The value for item 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Reference item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      initBits &= ~INIT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#id() id} to id.
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
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#id() id} to id.
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
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#relationtype() relationtype} to relationtype.
     * @param relationtype The value for relationtype
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationtype(Catalogentry_relatedentryRelationtype relationtype) {
      checkNotIsSet(relationtypeIsSet(), "relationtype");
      this.relationtype = Objects.requireNonNull(relationtype, "relationtype");
      optBits |= OPT_BIT_RELATIONTYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#relationtype() relationtype} to relationtype.
     * @param relationtype The value for relationtype
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationtype")
    public final Builder relationtype(Optional<? extends Catalogentry_relatedentryRelationtype> relationtype) {
      checkNotIsSet(relationtypeIsSet(), "relationtype");
      this.relationtype = relationtype.orElse(null);
      optBits |= OPT_BIT_RELATIONTYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#extension() extension} to extension.
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
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#extension() extension} to extension.
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
     * Builds a new {@link CatalogEntry_RelatedEntry CatalogEntry_RelatedEntry}.
     * @return An immutable instance of CatalogEntry_RelatedEntry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CatalogEntry_RelatedEntry build() {
      checkRequiredAttributes();
      return new ImmutableCatalogEntry_RelatedEntry(modifierExtension, item, id, relationtype, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean relationtypeIsSet() {
      return (optBits & OPT_BIT_RELATIONTYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean itemIsSet() {
      return (initBits & INIT_BIT_ITEM) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CatalogEntry_RelatedEntry is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!itemIsSet()) attributes.add("item");
      return "Cannot build CatalogEntry_RelatedEntry, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CatalogEntry_RelatedEntry", generator = "Immutables")
  public interface ItemBuildStage {
    /**
     * Initializes the value for the {@link CatalogEntry_RelatedEntry#item() item} attribute.
     * @param item The value for item 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(Reference item);
  }

  @Generated(from = "CatalogEntry_RelatedEntry", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#relationtype() relationtype} to relationtype.
     * @param relationtype The value for relationtype
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relationtype(Catalogentry_relatedentryRelationtype relationtype);

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#relationtype() relationtype} to relationtype.
     * @param relationtype The value for relationtype
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relationtype(Optional<? extends Catalogentry_relatedentryRelationtype> relationtype);

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CatalogEntry_RelatedEntry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link CatalogEntry_RelatedEntry CatalogEntry_RelatedEntry}.
     * @return An immutable instance of CatalogEntry_RelatedEntry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CatalogEntry_RelatedEntry build();
  }
}
