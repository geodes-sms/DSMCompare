/**
 */
package activitiesDSL.provider;

import activitiesDSL.util.ActivitiesDSLAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesDSLItemProviderAdapterFactory extends ActivitiesDSLAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesDSLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.ResourceKind} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceKindItemProvider resourceKindItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.ResourceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceKindAdapter() {
		if (resourceKindItemProvider == null) {
			resourceKindItemProvider = new ResourceKindItemProvider(this);
		}

		return resourceKindItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.Culture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CultureItemProvider cultureItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.Culture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCultureAdapter() {
		if (cultureItemProvider == null) {
			cultureItemProvider = new CultureItemProvider(this);
		}

		return cultureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.ExploitationActivity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExploitationActivityItemProvider exploitationActivityItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.ExploitationActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExploitationActivityAdapter() {
		if (exploitationActivityItemProvider == null) {
			exploitationActivityItemProvider = new ExploitationActivityItemProvider(this);
		}

		return exploitationActivityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.ActivityResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityResourceItemProvider activityResourceItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.ActivityResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityResourceAdapter() {
		if (activityResourceItemProvider == null) {
			activityResourceItemProvider = new ActivityResourceItemProvider(this);
		}

		return activityResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.Predicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateItemProvider predicateItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.Predicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateAdapter() {
		if (predicateItemProvider == null) {
			predicateItemProvider = new PredicateItemProvider(this);
		}

		return predicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.NoRain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoRainItemProvider noRainItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.NoRain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNoRainAdapter() {
		if (noRainItemProvider == null) {
			noRainItemProvider = new NoRainItemProvider(this);
		}

		return noRainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.TempOfTheDay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TempOfTheDayItemProvider tempOfTheDayItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.TempOfTheDay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTempOfTheDayAdapter() {
		if (tempOfTheDayItemProvider == null) {
			tempOfTheDayItemProvider = new TempOfTheDayItemProvider(this);
		}

		return tempOfTheDayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.DelaySinceActivy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelaySinceActivyItemProvider delaySinceActivyItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.DelaySinceActivy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelaySinceActivyAdapter() {
		if (delaySinceActivyItemProvider == null) {
			delaySinceActivyItemProvider = new DelaySinceActivyItemProvider(this);
		}

		return delaySinceActivyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.GrainIs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrainIsItemProvider grainIsItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.GrainIs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGrainIsAdapter() {
		if (grainIsItemProvider == null) {
			grainIsItemProvider = new GrainIsItemProvider(this);
		}

		return grainIsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link activitiesDSL.Date} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateItemProvider dateItemProvider;

	/**
	 * This creates an adapter for a {@link activitiesDSL.Date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateAdapter() {
		if (dateItemProvider == null) {
			dateItemProvider = new DateItemProvider(this);
		}

		return dateItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (modelItemProvider != null) modelItemProvider.dispose();
		if (resourceKindItemProvider != null) resourceKindItemProvider.dispose();
		if (cultureItemProvider != null) cultureItemProvider.dispose();
		if (exploitationActivityItemProvider != null) exploitationActivityItemProvider.dispose();
		if (activityResourceItemProvider != null) activityResourceItemProvider.dispose();
		if (predicateItemProvider != null) predicateItemProvider.dispose();
		if (noRainItemProvider != null) noRainItemProvider.dispose();
		if (tempOfTheDayItemProvider != null) tempOfTheDayItemProvider.dispose();
		if (delaySinceActivyItemProvider != null) delaySinceActivyItemProvider.dispose();
		if (grainIsItemProvider != null) grainIsItemProvider.dispose();
		if (dateItemProvider != null) dateItemProvider.dispose();
	}

}
